import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        int quartosCadastrados = 0;
        final int tam = 5;

        int[] quartos = new int[tam];
        int[] camas = new int[tam];
        
        int maxReservas = 25;
        String[] hospedes = new String[tam];



        do {
            System.out.println("\nGestão de Cadastros");
            System.out.println("1 - Cadastrar quartos");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Consultar reservas por quarto");
            System.out.println("4 - Consultar reservas por hóspede");
            System.out.println("5 - Encerrar sistema");

            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                // Para cada quarto cadastrado, o sistema deve solicitar:

                // Quantidade de camas disponíveis em cada quarto.

                case 1:
                    if (quartosCadastrados < tam) {

                        System.out.print("Digite o número do quarto: ");
                        quartos[quartosCadastrados] = sc.nextInt();

                        System.out.print("Informe a quantidade de camas disponíveis no quarto: ");
                        camas[quartosCadastrados] = sc.nextInt();

                        quartosCadastrados++;

                        System.out.println("Quarto cadastrado com sucesso!");
                        System.out.println("Você tem " + quartosCadastrados + " quarto cadastrado!");

                    } else {
                        System.out.println("Limite de quartos cadastrados atingido.");
                    }

                    break;
                    // Reservar quarto
                    // Solicitar o número do quarto
                    // verificar se o quarto existe
                case 2:
                    System.out.print("Digite o número do quarto: ");
                    int quartoReserva = sc.nextInt();

                    int i = 0;

                    while (i < quartosCadastrados && quartos[i] != quartoReserva) {
                        i++;

                        System.out.println("Inform o nome do hospede: ");
                        String nomeHospede = sc.nextLine();
                        
                    }



                    
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 6);

        sc.close();
    }
}
