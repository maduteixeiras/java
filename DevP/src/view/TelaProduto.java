package view;

import controller.ProdutoController;
import model.Produto;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaProduto extends JFrame {
    private JTextField txtId, txtNome, txtCategoria, txtPreco, txtQuantidade;
    private JTextArea txtAreaListagem;
    private JButton btnCadastrar, btnListar, btnAlterar, btnExcluir, btnPesquisar;
    private ProdutoController produtoController = new ProdutoController();

    public TelaProduto() {
        setTitle("Gerenciamento de Produtos");
        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Painel do Formulário (Campos de Entrada)
        JPanel panelForm = new JPanel(new GridLayout(5, 2, 5, 5));
        panelForm.setBorder(BorderFactory.createTitledBorder("Dados do Produto"));
        
        panelForm.add(new JLabel("ID (Apenas números):")); txtId = new JTextField(); panelForm.add(txtId);
        panelForm.add(new JLabel("Nome:")); txtNome = new JTextField(); panelForm.add(txtNome);
        panelForm.add(new JLabel("Categoria:")); txtCategoria = new JTextField(); panelForm.add(txtCategoria);
        panelForm.add(new JLabel("Preço:")); txtPreco = new JTextField(); panelForm.add(txtPreco);
        panelForm.add(new JLabel("Quantidade:")); txtQuantidade = new JTextField(); panelForm.add(txtQuantidade);
        add(panelForm, BorderLayout.NORTH);

        // Painel Central (Listagem)
        txtAreaListagem = new JTextArea();
        txtAreaListagem.setEditable(false);
        add(new JScrollPane(txtAreaListagem), BorderLayout.CENTER);

        // Painel Inferior (Botões de Ação)
        JPanel panelBotoes = new JPanel(new FlowLayout());
        btnCadastrar = new JButton("Cadastrar");
        btnListar = new JButton("Listar");
        btnPesquisar = new JButton("Pesquisar por ID");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Remover");

        panelBotoes.add(btnCadastrar);
        panelBotoes.add(btnListar);
        panelBotoes.add(btnPesquisar);
        panelBotoes.add(btnAlterar);
        panelBotoes.add(btnExcluir);
        add(panelBotoes, BorderLayout.SOUTH);

        // Configuração dos Eventos (Ações dos Botões)
        btnCadastrar.addActionListener(e -> cadastrar());
        btnListar.addActionListener(e -> listar());
        btnPesquisar.addActionListener(e -> pesquisar());
        btnAlterar.addActionListener(e -> alterar());
        btnExcluir.addActionListener(e -> excluir());
    }

    private void cadastrar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            String cat = txtCategoria.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            int qtd = Integer.parseInt(txtQuantidade.getText());

            if (produtoController.cadastrar(id, nome, cat, preco, qtd)) {
                JOptionPane.showMessageDialog(this, "Produto cadastrado!");
                limparCampos();
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Erro: ID já existente.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preencha os campos numéricos corretamente!");
        }
    }

    private void listar() {
        List<Produto> lista = produtoController.listar();
        txtAreaListagem.setText("--- LISTA DE PRODUTOS ---\n");
        if (lista.isEmpty()) {
            txtAreaListagem.append("Nenhum produto cadastrado.\n");
        } else {
            for (Produto p : lista) {
                txtAreaListagem.append(String.format("ID: %d | %s | Cat: %s | R$ %.2f | Est: %d unidades\n", 
                        p.getId(), p.getNome(), p.getCategoria(), p.getPreco(), p.getQuantidade()));
            }
        }
    }

    private void pesquisar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            Produto p = produtoController.pesquisar(id);
            if (p != null) {
                txtNome.setText(p.getNome());
                txtCategoria.setText(p.getCategoria());
                txtPreco.setText(String.valueOf(p.getPreco()));
                txtQuantidade.setText(String.valueOf(p.getQuantidade()));
                JOptionPane.showMessageDialog(this, "Produto encontrado e carregado nos campos!");
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira um ID válido para pesquisar!");
        }
    }

    private void alterar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            if (produtoController.atualizar(id, txtNome.getText(), txtCategoria.getText(), 
                    Double.parseDouble(txtPreco.getText()), Integer.parseInt(txtQuantidade.getText()))) {
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!");
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado para alteração.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verifique os dados informados!");
        }
    }

    private void excluir() {
        try {
            int id = Integer.parseInt(txtId.getText());
            if (produtoController.excluir(id)) {
                JOptionPane.showMessageDialog(this, "Produto removido!");
                limparCampos();
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira um ID válido para exclusão!");
        }
    }

    private void limparCampos() {
        txtId.setText(""); txtNome.setText(""); txtCategoria.setText(""); txtPreco.setText(""); txtQuantidade.setText("");
    }
}
