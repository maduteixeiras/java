
package view;

import controle.ClienteControle;
import modelo.Cliente;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ClienteView {

    private ClienteControle controle;

    public ClienteView() {
        controle = new ClienteControle();
        executar();
    }

    private void executar() {
        int opcao;

        do {
            String menu = """
                    1 - Cadastrar cliente
                    2 - Buscar cliente
                    3 - Alterar cliente
                    4 - Excluir cliente
                    5 - Listar clientes
                    6 - Limpar campos
                    0 - Sair

                    Escolha uma opção:
                    """;

            String entrada = JOptionPane.showInputDialog(
                    null, menu, "Cadastro de Clientes",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                break;
            }

            try {
                opcao = Integer.parseInt(entrada.trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null, "Digite uma opção numérica válida."
                );
                continue;
            }

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> buscar();
                case 3 -> alterar();
                case 4 -> excluir();
                case 5 -> listar();
                case 6 -> limpar();
                case 0 -> JOptionPane.showMessageDialog(
                        null, "Sistema encerrado."
                );
                default -> JOptionPane.showMessageDialog(
                        null, "Opção inválida."
                );
            }

        } while (true);
    }

    private Integer lerCodigo() {
        String entrada = JOptionPane.showInputDialog(
                null, "Informe o código do cliente:"
        );

        if (entrada == null) {
            return null;
        }

        try {
            int codigo = Integer.parseInt(entrada.trim());

            if (codigo <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "O código deve ser um inteiro positivo."
                );
                return null;
            }

            return codigo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Código inválido. Digite um número inteiro positivo."
            );
            return null;
        }
    }

    private String lerCampo(String mensagem) {
        String valor = JOptionPane.showInputDialog(null, mensagem);

        if (valor == null) {
            return null;
        }

        if (valor.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "O campo não pode ficar vazio."
            );
            return null;
        }

        return valor.trim();
    }

    private void cadastrar() {
        Integer codigo = lerCodigo();

        if (codigo == null) {
            return;
        }

        if (controle.buscar(codigo) != null) {
            JOptionPane.showMessageDialog(
                    null, "Já existe um cliente com esse código."
            );
            return;
        }

        String nome = lerCampo("Informe o nome:");
        if (nome == null) return;

        String telefone = lerCampo("Informe o telefone:");
        if (telefone == null) return;

        String email = lerCampo("Informe o e-mail:");
        if (email == null) return;

        controle.cadastrar(codigo, nome, telefone, email);

        JOptionPane.showMessageDialog(
                null, "Cliente cadastrado com sucesso!"
        );
    }

    private void buscar() {
        Integer codigo = lerCodigo();

        if (codigo == null) {
            return;
        }

        Cliente cliente = controle.buscar(codigo);

        if (cliente == null) {
            JOptionPane.showMessageDialog(
                    null, "Cliente não encontrado."
            );
            return;
        }

        JOptionPane.showMessageDialog(
                null,
                "DADOS DO CLIENTE\n\n"
                + "Código: " + cliente.getCodigo() + "\n"
                + "Nome: " + cliente.getNome() + "\n"
                + "Telefone: " + cliente.getTelefone() + "\n"
                + "E-mail: " + cliente.getEmail()
        );
    }

    private void alterar() {
        Integer codigo = lerCodigo();

        if (codigo == null) {
            return;
        }

        Cliente cliente = controle.buscar(codigo);

        if (cliente == null) {
            JOptionPane.showMessageDialog(
                    null, "Cliente não encontrado."
            );
            return;
        }

        String nome = lerCampo("Novo nome:");
        if (nome == null) return;

        String telefone = lerCampo("Novo telefone:");
        if (telefone == null) return;

        String email = lerCampo("Novo e-mail:");
        if (email == null) return;

        boolean alterado = controle.alterar(
                codigo, nome, telefone, email
        );

        if (alterado) {
            JOptionPane.showMessageDialog(
                    null, "Cliente alterado com sucesso!"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null, "Não foi possível alterar o cliente."
            );
        }
    }

    private void excluir() {
        Integer codigo = lerCodigo();

        if (codigo == null) {
            return;
        }

        Cliente cliente = controle.buscar(codigo);

        if (cliente == null) {
            JOptionPane.showMessageDialog(
                    null, "Cliente não encontrado."
            );
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Deseja excluir o cliente "
                        + cliente.getNome() + "?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            boolean removido = controle.remover(codigo);

            if (removido) {
                JOptionPane.showMessageDialog(
                        null, "Cliente excluído com sucesso!"
                );
            }
        }
    }

    private void listar() {
        ArrayList<Cliente> clientes = controle.listar();

        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "Nenhum cliente cadastrado."
            );
            return;
        }

        StringBuilder lista = new StringBuilder(
                "CLIENTES CADASTRADOS\n\n"
        );

        for (Cliente cliente : clientes) {
            lista.append("Código: ")
                 .append(cliente.getCodigo())
                 .append("\nNome: ")
                 .append(cliente.getNome())
                 .append("\nTelefone: ")
                 .append(cliente.getTelefone())
                 .append("\nE-mail: ")
                 .append(cliente.getEmail())
                 .append("\n-------------------------\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private void limpar() {
        JOptionPane.showMessageDialog(
                null, "Campos limpos. Você pode iniciar uma nova operação."
        );
    }

    public static void main(String[] args) {
        new ClienteView();
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
}
