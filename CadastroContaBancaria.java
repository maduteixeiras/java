import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> lista = new ArrayList<>();

        int op = -1;

        while (op != 4) {

            try {
                System.out.println("== MENU ==");
                System.out.println("1 - Cadastrar Conta");
                System.out.println("2 - Buscar Conta");
                System.out.println("3 - Remover Conta");
                System.out.println("4 - Sair");
                System.out.println("Escolha: ");

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {

                    case 1:

                        // Número da conta
                        System.out.println("Informe o número da conta:");
                        String numero = sc.nextLine();

                        if (numero.trim().isEmpty()) {
                            throw new Exception(
                                "O número da conta não pode ser vazio."
                            );
                        }

                        // Nome do titular
                        System.out.println("Informe o nome do titular da conta:");
                        String nome = sc.nextLine();

                        if (nome.trim().isEmpty()) {
                            throw new Exception(
                                "O nome do titular não pode ser vazio."
                            );
                        }

                        // Saldo
                        System.out.println("Informe o saldo disponível na conta:");
                        double saldo = sc.nextDouble();
                        sc.nextLine();

                        if (saldo < 0) {
                            throw new Exception(
                                "O saldo não pode ser negativo."
                            );
                        }

                        // Criando uma nova conta
                        Conta conta = new Conta();

                        // Colocando os dados dentro da conta
                        conta.numero = numero;
                        conta.titular = nome;
                        conta.saldo = saldo;

                        // Adicionando a conta na lista
                        lista.add(conta);

                        System.out.println(
                            "Conta de número " + numero +
                            " adicionada com sucesso!"
                        );

                        break;
                    case 2:
                            // Busca de conta
                        System.out.println("Informe o número da conta que deseja buscar: ");
                        String buscaNumero = sc.nextLine();

                        boolean encontrada = false;

                        for (Conta conta : lista) {

                            if (conta.numero.equals(buscaNumero)) {

                                System.out.println("Conta encontrada!");
                                System.out.println("Titular: " + conta.titular);
                                System.out.println("Saldo: R$ " + conta.saldo);

                                encontrada = true;
                                break;
                                }
                            }

                            if (!encontrada) {
                                throw new Exception("Conta não encontrada.");
                            }

                            break;


                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}
