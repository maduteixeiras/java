import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int tam = 5;
        String[] produtos = new String[tam];
        int[] quantidades = new int[tam];

        int qtd = 0;
        int op;

        do {
            System.out.println("\n===== Menu de Cadastro =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto por nome");
            System.out.println("4 - Alterar produto por nome");
            System.out.println("5 - Remover produto por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                // CADASTRAR
                case 1:
                    if (qtd >= tam) {
                        System.out.println("Cadastro cheio! Não é possível cadastrar mais produtos.");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.print("Digite a quantidade: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();

                        produtos[qtd] = nome;
                        quantidades[qtd] = quantidade;
                        qtd++;

                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                // LISTAR
                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n===== Produtos cadastrados =====");

                        for (int i = 0; i < qtd; i++) {
                            System.out.println(
                                (i + 1) + " - " + produtos[i]
                                + " | Quantidade: " + quantidades[i]
                            );
                        }
                    }
                    break;

                // PESQUISAR
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomePesquisa = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Produto encontrado!");
                            System.out.println("Nome: " + produtos[i]);
                            System.out.println("Quantidade: " + quantidades[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                // ALTERAR
                case 4:
                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();

                    encontrado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeAlterar)) {

                            System.out.print("Digite o novo nome: ");
                            produtos[i] = sc.nextLine();

                            System.out.print("Digite a nova quantidade: ");
                            quantidades[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Produto alterado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                // REMOVER
                case 5:
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    encontrado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeRemover)) {

                            // Move os produtos seguintes uma posição para trás
                            for (int j = i; j < qtd - 1; j++) {
                                produtos[j] = produtos[j + 1];
                                quantidades[j] = quantidades[j + 1];
                            }

                            produtos[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;

                            qtd--;

                            System.out.println("Produto removido com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                // SAIR
                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);

        sc.close();
    }
}
