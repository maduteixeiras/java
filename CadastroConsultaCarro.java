import java.util.ArrayList;
import javax.swing.JOptionPane;

import tryCatch.tryCatch;

public class CadastroConsultaCarro {
    public static void main(String[] args) {
        
        ArrayList<Carro> listaCarros = new ArrayList<>();
        boolean executando = true;
        
        while (executando) {
            String op = JOptionPane.showInputDialog(null, "Escolha uma opção: \n" +
                "1 - Cadastrar Carro\n" +
                "2 - Listar Carros\n"  +
                "3 - Detalhar Carro\n" +
                "4 - Alterar Carro\n" +
                "6 - Gravar Informações em Arquivo\n" +
                "7 - Sair", JOptionPane.QUESTION_MESSAGE
            );

            if (op == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                continue;
            }

            switch (op) {
                case "1":
                    String marca = JOptionPane.showInputDialog(null, "Digite a marca do carro: ", "Cadastro do Veículo", JOptionPane.QUESTION_MESSAGE);
                    String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro: ", "Cadastro do Veículo", JOptionPane.QUESTION_MESSAGE);
                    String anoString = JOptionPane.showInputDialog(null, "Digite o ano do carro: ", "Cadastro do Veículo", JOptionPane.QUESTION_MESSAGE);

                    if (marca == null || marca.trim().isEmpty() ||  
                        modelo == null || modelo.trim().isEmpty() || 
                        anoString == null || anoString.trim().isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null, "Veículo não Cadastrado!");
                    } else {
                        try {
                            int ano = Integer.parseInt(anoString.trim());
                            Carro novoCarro = new Carro(marca, modelo, ano);
                            listaCarros.add(novoCarro);

                            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Ano inválido.");
                        }
                    }
                    break;

                case "2":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo foi cadastrado.");
                    } else {
                        String l = "Carros Cadastrados: \n\n";
                        for (int i = 0; i < listaCarros.size(); i++) {
                            l += (i + 1) + " - " + listaCarros.get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, l, "Listando Veículos", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                
                case "3" :
                    String detalhado = JOptionPane.showInputDialog(null, "Informe o número do veículo que deseja buscar: ", "Detalhando Carro", JOptionPane.QUESTION_MESSAGE);

                    if (detalhado == null) {
                        
                    }

                                
            
                default:
                    break;
            }
        }
    }
}