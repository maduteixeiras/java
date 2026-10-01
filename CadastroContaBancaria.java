import java.util.ArrayList;
import java.util.Scanner;
public class CadastroContaBancaria {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> Lista = new ArrayList<>();
        int op = -1;

        while ( op != 0) {
            // Desenvolva uma aplicação Java executada pelo terminal que permita cadastrar, buscar e remover contas.
            // O sistema deverá apresentar as seguintes opções ao usuário:
            // • 1. Cadastrar Conta
            // • 2. Buscar Conta
            // • 3. Remover Conta
            // • 4. Sair
            try {
                System.out.println("== MENU ==");
                System.out.println("1 - Cadastrar Conta ");
                System.out.println("2 - Buscar Conta");
                System.out.println("3 - Remover Conta");
                System.out.println("4 - Sair");
                System.out.println("Escolha: ");

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    // Ao escolher a opção de cadastro, o usuário deverá informar o número da conta, o nome do titular e o saldo inicial.
                    // O sistema deverá impedir as seguintes situações:
                    // • cadastro de conta sem número;
                    // • cadastro de conta sem nome do titular;
                    // • saldo inicial negativo;
                    // • cadastro de duas contas com o mesmo número;
                    // • cadastro acima do limite máximo de 100 contas.

                    // Quando alguma dessas situações ocorrer, o programa deverá lançar e tratar uma exceção
                    // adequada, exibindo uma mensagem clara ao usuário.
                    case 1:
                        System.out.println("Informe o número da conta:");
                        String numeroConta = sc.nextLine();
                        if (numeroConta.trim().isEmpty()) {
                            throw new Exception("O número da conta não pode ser vazio.");
                        }else {
                            
                            System.out.println("Conta de número" + numeroConta + " adicionado com sucesso!");
                        }

                        
                        break;
                
                    default:
                        break;
                }
            }catch(Exception e){}

            
        }
        sc.close();

    }
}