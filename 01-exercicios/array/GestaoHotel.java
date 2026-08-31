import java.util.Scanner;

public class GestaoHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        // Limites do sistema
        final int maxQuartos = 5;
        final int maxReservas = 25;

        // Controle
        int quartosCadastrados = 0;
        int reservasCadastradas = 0;
        int totalCamas = 0;

        // Cadastro dos quartos
        int[] quartos = new int[maxQuartos];
        int[] camas = new int[maxQuartos];

        // Cadastro das reservas
        int[] quartoReserva = new int[maxReservas];
        String[] hospedes = new String[maxReservas];

        do {
            System.out.println("\n===== GESTÃO DE CADASTROS =====");
            System.out.println("1 - Cadastrar quartos");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Consultar reservas por quarto");
            System.out.println("4 - Consultar reservas por hóspede");
            System.out.println("5 - Encerrar sistema");

            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {

                case 1:

                    if (quartosCadastrados < maxQuartos) {

                        System.out.print("Digite o número do quarto: ");
                        int numeroQuarto = sc.nextInt();

                        // Verifica se o quarto já existe
                        int i = 0;

                        while (i < quartosCadastrados && quartos[i] != numeroQuarto) {
                            i++;
                        }

                        if (i < quartosCadastrados) {

                            System.out.println("Este quarto já está cadastrado!");

                        } else {

                            System.out.print("Informe a quantidade de camas disponíveis no quarto: ");
                            int quantidadeCamas = sc.nextInt();

                            // Verifica se a quantidade de camas é válida
                            if (quantidadeCamas <= 0) {

                                System.out.println("A quantidade de camas deve ser maior que zero.");

                            } else if (totalCamas + quantidadeCamas > maxReservas) {

                                System.out.println(
                                    "Não é possível cadastrar este quarto."
                                );
                                System.out.println(
                                    "O limite máximo de " + maxReservas + " camas/reservas seria ultrapassado."
                                );

                            } else {

                                quartos[quartosCadastrados] = numeroQuarto;
                                camas[quartosCadastrados] = quantidadeCamas;

                                quartosCadastrados++;
                                totalCamas += quantidadeCamas;

                                System.out.println("Quarto cadastrado com sucesso!");
                                System.out.println(
                                    "Quartos cadastrados: "
                                    + quartosCadastrados
                                    + "/" + maxQuartos
                                );
                                System.out.println(
                                    "Capacidade total de camas: "
                                    + totalCamas
                                    + "/" + maxReservas
                                );
                            }
                        }

                    } else {

                        System.out.println("Limite de quartos cadastrados atingido.");

                    }

                    break;
                case 2:

                    if (reservasCadastradas >= maxReservas) {

                        System.out.println("Limite máximo de reservas atingido.");

                        break;
                    }

                    if (quartosCadastrados == 0) {

                        System.out.println("Nenhum quarto foi cadastrado.");

                        break;
                    }

                    System.out.print("Digite o número do quarto: ");
                    int quartoReservaInformado = sc.nextInt();

                    int indiceQuarto = 0;

                    // Procura o quarto
                    while (
                        indiceQuarto < quartosCadastrados
                        && quartos[indiceQuarto] != quartoReservaInformado
                    ) {
                        indiceQuarto++;
                    }

                    // Quarto não encontrado
                    if (indiceQuarto == quartosCadastrados) {

                        System.out.println("Este quarto não existe!");

                    } 
                    // Quarto encontrado, mas sem camas
                    else if (camas[indiceQuarto] == 0) {

                        System.out.println("Não há camas disponíveis neste quarto!");

                    } 
                    // Quarto encontrado e possui cama disponível
                    else {

                        sc.nextLine(); // limpa o Enter deixado pelo nextInt()

                        System.out.print("Informe o nome do hóspede: ");
                        String nomeHospede = sc.nextLine();

                        // Registra a reserva
                        quartoReserva[reservasCadastradas] = quartoReservaInformado;
                        hospedes[reservasCadastradas] = nomeHospede;

                        // Diminui uma cama disponível
                        camas[indiceQuarto]--;

                        // Aumenta o número de reservas
                        reservasCadastradas++;

                        System.out.println("Reserva realizada com sucesso!");
                    } break;
                case 3:

                    if (reservasCadastradas == 0) {

                        System.out.println("Não existem reservas cadastradas.");

                        break;
                    }

                    System.out.print("Digite o número do quarto: ");
                    int quartoConsulta = sc.nextInt();

                    boolean encontrouReserva = false;

                    System.out.println("\nReservas do quarto " + quartoConsulta + ":");

                    for (int j = 0; j < reservasCadastradas; j++) {

                        if (quartoReserva[j] == quartoConsulta) {

                            System.out.println("- " + hospedes[j]);

                            encontrouReserva = true;
                        }
                    }

                    if (!encontrouReserva) {

                        System.out.println("Não existem reservas para este quarto.");

                    }

                    break;
                case 4:

                    if (reservasCadastradas == 0) {

                        System.out.println("Não existem reservas cadastradas.");

                        break;
                    }

                    sc.nextLine();

                    System.out.print("Digite o nome do hóspede: ");
                    String hospedeConsulta = sc.nextLine();

                    boolean encontrouHospede = false;

                    for (int j = 0; j < reservasCadastradas; j++) {

                        if (hospedes[j].equalsIgnoreCase(hospedeConsulta)) {

                            System.out.println(
                                "Hóspede: "
                                + hospedes[j]
                                + " | Quarto: "
                                + quartoReserva[j]
                            );

                            encontrouHospede = true;
                        }
                    }

                    if (!encontrouHospede) {

                        System.out.println("Hóspede não encontrado.");

                    }

                    break;


                case 5:

                    System.out.println("Sistema encerrado.");

                    break;


                default:

                    System.out.println("Opção inválida.");

                    break;
            }

        } while (op != 5);

        sc.close();
    }
}
