import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroConsultaCarro {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();
        boolean executando = true;

        while (executando) {

            String op = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:\n" +
                "1 - Cadastrar Carro\n" +
                "2 - Listar Carros\n" +
                "3 - Detalhar Carro\n" +
                "4 - Alterar Carro\n" +
                "6 - Gravar Informações em Arquivo\n" +
                "7 - Sair",
                "Cadastro de Carros",
                JOptionPane.QUESTION_MESSAGE
            );

            if (op == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                continue;
            }

            switch (op) {

                case "1":

                    String marca = JOptionPane.showInputDialog(
                        null,
                        "Digite a marca do carro:",
                        "Cadastro do Veículo",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    String modelo = JOptionPane.showInputDialog(
                        null,
                        "Digite o modelo do carro:",
                        "Cadastro do Veículo",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    String anoString = JOptionPane.showInputDialog(
                        null,
                        "Digite o ano do carro:",
                        "Cadastro do Veículo",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (marca == null || marca.trim().isEmpty()
                            || modelo == null || modelo.trim().isEmpty()
                            || anoString == null || anoString.trim().isEmpty()) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Veículo não cadastrado!"
                        );

                    } else {

                        try {
                            int ano = Integer.parseInt(anoString.trim());

                            Carro novoCarro = new Carro(
                                marca.trim(),
                                modelo.trim(),
                                ano
                            );

                            listaCarros.add(novoCarro);

                            JOptionPane.showMessageDialog(
                                null,
                                "Carro cadastrado com sucesso!"
                            );

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                null,
                                "Ano inválido. Digite apenas números."
                            );
                        }
                    }

                    break;

                case "2":

                    if (listaCarros.isEmpty()) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Nenhum veículo foi cadastrado!"
                        );

                    } else {

                        String lista = "Carros Cadastrados:\n\n";

                        for (int i = 0; i < listaCarros.size(); i++) {
                            lista += i + " - " + listaCarros.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(
                            null,
                            lista,
                            "Listando Veículos",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                    }

                    break;


                case "3":

                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Nenhum veículo foi cadastrado!"
                        );
                        break;
                    }

                    String detalhado = JOptionPane.showInputDialog(
                        null,
                        "Informe o número do veículo que deseja buscar:",
                        "Detalhando Carro",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (detalhado == null || detalhado.trim().isEmpty()) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Campo não pode ser vazio!"
                        );

                    } else {

                        try {
                            int indice = Integer.parseInt(detalhado.trim());

                            if (indice >= 0 && indice < listaCarros.size()) {

                                JOptionPane.showMessageDialog(
                                    null,
                                    listaCarros.get(indice),
                                    "Detalhes do Veículo",
                                    JOptionPane.INFORMATION_MESSAGE
                                );

                            } else {

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Veículo não cadastrado."
                                );
                            }

                        } catch (NumberFormatException e) {

                            JOptionPane.showMessageDialog(
                                null,
                                "Digite um número válido."
                            );
                        }
                    }

                    break;

                case "4":

                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Nenhum veículo foi cadastrado!"
                        );
                        break;
                    }

                    String alterado = JOptionPane.showInputDialog(
                        null,
                        "Informe o número do veículo que deseja alterar:",
                        "Alterar Veículo",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (alterado == null || alterado.trim().isEmpty()) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Campo não pode ser vazio!"
                        );

                    } else {

                        try {

                            int indice = Integer.parseInt(alterado.trim());

                            if (indice < 0 || indice >= listaCarros.size()) {

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Veículo não cadastrado."
                                );

                                break;
                            }

                            String marca2 = JOptionPane.showInputDialog(
                                null,
                                "Digite a nova marca do carro:",
                                "Alterar Veículo",
                                JOptionPane.QUESTION_MESSAGE
                            );

                            String modelo2 = JOptionPane.showInputDialog(
                                null,
                                "Digite o novo modelo do carro:",
                                "Alterar Veículo",
                                JOptionPane.QUESTION_MESSAGE
                            );

                            String anoString2 = JOptionPane.showInputDialog(
                                null,
                                "Digite o novo ano do carro:",
                                "Alterar Veículo",
                                JOptionPane.QUESTION_MESSAGE
                            );

                            if (marca2 == null || marca2.trim().isEmpty()
                                    || modelo2 == null || modelo2.trim().isEmpty()
                                    || anoString2 == null || anoString2.trim().isEmpty()) {

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Erro - Todos os campos são obrigatórios"
                                );

                            } else {

                                try {

                                    int ano2 = Integer.parseInt(
                                        anoString2.trim()
                                    );

                                    Carro carroAlterado = new Carro(
                                        marca2.trim(),
                                        modelo2.trim(),
                                        ano2
                                    );

                                    listaCarros.set(indice, carroAlterado);

                                    JOptionPane.showMessageDialog(
                                        null,
                                        "Carro alterado com sucesso!"
                                    );

                                } catch (Exception e) {

                                    JOptionPane.showMessageDialog(
                                        null,
                                        "Ano inválido."
                                    );
                                }
                            }

                        } catch (Exception e) {

                            JOptionPane.showMessageDialog(
                                null,
                                "Digite um número válido."
                            );
                        }
                    }

                    break;

                case "5":
                    
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Nenhum veículo foi cadastrado!"
                        );
                        break;
                    }

                    String removido = JOptionPane.showInputDialog(
                        null,
                        "Informe o número do veículo que deseja remover:",
                        "Remover Veículo",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (removido == null || removido.trim().isEmpty()) {

                        JOptionPane.showMessageDialog(
                            null,
                            "Campo não pode ser vazio!"
                        );

                    } else {
                        try {
                            int indice = Integer.parseInt(removido.trim());
                            listaCarros.remove(indice);
                            JOptionPane.showMessageDialog(null, "Veículo removido com sucesso!");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,"Veículo não encontado!");
                        }
                    }



                    break;
                case "7":

                    JOptionPane.showMessageDialog(
                        null,
                        "Encerrando..."
                    );

                    executando = false;

                    break;


                default:

                    JOptionPane.showMessageDialog(
                        null,
                        "Opção inválida. Escolha uma opção de 1 a 7."
                    );

                    break;
            }
        }
    }
}
