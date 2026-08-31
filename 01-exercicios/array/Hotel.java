import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxQuartos = 5;
        int maxReservas = 25;

        int[] quartos = new int[maxQuartos];
        int[] reservas = new int[maxReservas];

        String[] hospedes = new String[maxReservas];
        int[] quartoReserva = new int[maxReservas];
        int[] camasDisponiveis = new int[maxQuartos];

        int quantidadeQuartos;
        int totalReservas = 0;

        boolean quartosCadastrados = false;
        boolean camasCadastradas = false;

        int op;

        System.out.println("Informe a quantidade de quartos disponíveis: (máximo de 5)");
        quantidadeQuartos = sc.nextInt();

        while (quantidadeQuartos < 1 || quantidadeQuartos > 5) {
            System.out.println("Quantidade inválida! Digite um valor entre 1 e 5:");
            quantidadeQuartos = sc.nextInt();
        }

        do {

            System.out.println("-- Menu --");
            System.out.println("1 - Registrar quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quartos");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reserva por nome");
            System.out.println("6 - Mostrar relatório geral");
            System.out.println("7 - Encerrar");
            System.out.println("Escolha uma opção:");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("\n-- Cadastro de quartos --");

                    for (int i = 0; i < quantidadeQuartos; i++) {
                        System.out.println("Informe o número do quarto " + (i + 1) + ":");
                        quartos[i] = sc.nextInt();
                    }

                    quartosCadastrados = true;
                    System.out.println("Quartos cadastrados com sucesso!");
                    break;

                case 2:
                    if (!quartosCadastrados) {
                        System.out.println("Cadastre primeiro os números dos quartos!");
                    } else {
                        System.out.println("\n-- Cadastro de camas por quarto --");

                        for (int i = 0; i < quantidadeQuartos; i++) {
                            System.out.println(
                                "Informe a quantidade de camas disponíveis do quarto "
                                + quartos[i] + ":"
                            );

                            camasDisponiveis[i] = sc.nextInt();
                        }

                        camasCadastradas = true;
                        System.out.println("Quantidade de camas cadastradas com sucesso!");
                    }
                    break;

                case 3:
                    if (!camasCadastradas) {
                        System.out.println("Cadastre primeiro o número de quartos!");
                    } else if (!camasCadastradas) {
                        System.out.println("Cadastre primeiro as camas!");
                    } else if (totalReservas >= maxReservas) {
                        System.out.println("Limite de reservas atingido!");
                    } else {
                        int numerosQuartos;
                        int posicaoQuartos = 1;

                        System.out.println("Informe o número do quarto para reserva:");
                        numeroQuarto = sc.nextInt();

                        for (int i = 0; i < quantidadeQuartos; i++) {
                            

                        }
                        
                    }
                    break;

                default:
                    break;
            }

        } while (op != 7);

        sc.close();
    }
}
