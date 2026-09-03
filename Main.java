import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAvioes = 4;
        int[] numerosAvioes = new int[maxAvioes];
        int maxAssentos = 4;
        int[] assentosDisponiveis = new int[maxAssentos];
        int qtdAvioesCadastrados = 0;

        int maxPassageiros = 20;
        String[] nomesPassageiros = new String[maxPassageiros];
        int maxReservas = 20;
        int[] aviaoPorReserva = new int[maxReservas];
        int totalReservas = 0;

        int op = 0;

        while (op != 8) {

            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe quantos aviões deseja cadastrar: ");
                    int qtd = scanner.nextInt();

                    while (qtd < 1 || qtd > 4) {
                        System.out.println("Informe um valor entre 1 e 4: ");
                        qtd = scanner.nextInt();
                    }

                    qtdAvioesCadastrados = qtd;

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        boolean numeroValido = false;
                        while (!numeroValido) {
                            System.out.print("Informe o número do avião " + (i + 1) + ": ");
                            int numAviao = scanner.nextInt();

                            boolean jaExiste = false;
                            for (int j = 0; j < i; j++) {
                                if (numerosAvioes[j] == numAviao) {
                                    jaExiste = true;
                                    break;
                                }
                            }

                            if (jaExiste) {
                                System.out.println("Número já foi cadastrado!");
                            } else {
                                numerosAvioes[i] = numAviao;
                                numeroValido = true;
                            }
                        }
                    }
                    System.out.println("Aviões cadastrados com sucesso!");
                    break;

                case 2:
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado. Cadastre os aviões primeiro!");
                    } else {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            System.out.print("Informe a quantidade de assentos do avião " + numerosAvioes[i] + " (0 a 20): ");
                            int assentos = scanner.nextInt();

                            while (assentos < 0 || assentos > 20) {
                                System.out.print("Quantidade inválida! Informe um valor de 0 a 20: ");
                                assentos = scanner.nextInt();
                            }

                            assentosDisponiveis[i] = assentos;
                        }
                        System.out.println("Assentos cadastrados com sucesso!");
                    }
                    break;

                case 3:
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado.");
                    } else {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            System.out.println("Avião: " + numerosAvioes[i] + " | Assentos disponíveis: " + assentosDisponiveis[i]);
                        }
                    }
                    break;

                case 4:
                    if (totalReservas >= 20) {
                        System.out.println("Limite de 20 reservas já atingido!");
                        break;
                    }

                    System.out.print("Informe o número do avião para reserva: ");
                    int numAviaoReserva = scanner.nextInt();

                    int indiceAviao = -1;
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (numerosAvioes[i] == numAviaoReserva) {
                            indiceAviao = i;
                            break;
                        }
                    }

                    if (indiceAviao == -1) {
                        System.out.println("Este avião não existe!");
                    } else if (assentosDisponiveis[indiceAviao] <= 0) {
                        System.out.println("Não há assentos disponíveis para este avião!");
                    } else {
                        String nomePassageiro = "";
                        while (nomePassageiro.trim().isEmpty()) {
                            System.out.print("Informe o nome do passageiro: ");
                            nomePassageiro = scanner.next();

                        }

                        nomesPassageiros[totalReservas] = nomePassageiro;
                        aviaoPorReserva[totalReservas] = numAviaoReserva;
                        assentosDisponiveis[indiceAviao]--;
                        totalReservas++;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o número do avião para consulta: ");
                    int numAviaoConsulta = scanner.nextInt();

                    boolean aviaoExiste = false;
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (numerosAvioes[i] == numAviaoConsulta) {
                            aviaoExiste = true;
                            break;
                        }
                    }

                    if (!aviaoExiste) {
                        System.out.println("Este avião não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        for (int i = 0; i < totalReservas; i++) {
                            if (aviaoPorReserva[i] == numAviaoConsulta) {
                                System.out.println("Passageiro: " + nomesPassageiros[i]);
                                encontrouReserva = true;
                            }
                        }
                        if (!encontrouReserva) {
                            System.out.println("Não há reservas realizadas para este avião!");
                        }
                    }
                    break;

                case 6:
                    System.out.print("Informe o nome do passageiro para pesquisa: ");
                    String nomePesquisa = scanner.next();
                


                    boolean passageiroEncontrado = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (nomesPassageiros[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Reserva encontrada - Avião: " + aviaoPorReserva[i]);
                            passageiroEncontrado = true;
                        }
                    }

                    if (!passageiroEncontrado) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;

                case 7:
                    int totalAssentosDisponiveis = 0;
                    int avioesComAssentos = 0;
                    int avioesSemAssentos = 0;

                    int maiorQtdAssentos = -1;
                    int aviaoMaiorAssentos = -1;

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        int assentos = assentosDisponiveis[i];
                        totalAssentosDisponiveis += assentos;

                        if (assentos > 0) {
                            avioesComAssentos++;
                        } else {
                            avioesSemAssentos++;
                        }

                        if (assentos > maiorQtdAssentos) {
                            maiorQtdAssentos = assentos;
                            aviaoMaiorAssentos = numerosAvioes[i];
                        }
                    }

                    System.out.println("-- Resumo --");
                    System.out.println("Quantidade de aviões cadastrados: " + qtdAvioesCadastrados);
                    System.out.println("Quantidade total de reservas realizadas: " + totalReservas);
                    System.out.println("Quantidade total de assentos disponíveis: " + totalAssentosDisponiveis);
                    System.out.println("Quantidade de aviões com assentos disponíveis: " + avioesComAssentos);
                    System.out.println("Quantidade de aviões sem assentos disponíveis: " + avioesSemAssentos);

                    if (qtdAvioesCadastrados > 0) {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: " + aviaoMaiorAssentos + " (" + maiorQtdAssentos + " assentos)");
                    } else {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: Nenhum");
                    }
                    break;

                case 8:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}