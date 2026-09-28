package tryCatch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryC5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int op = -1;

        while (op != 0) {

            try {
                System.out.println("=== MENU ===");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Listar");
                System.out.println("3 - Remover");
                System.out.println("0 - Sair");
                System.out.println("Informe a opção:");

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {

                    case 1:
                        System.out.println("Informe o nome:");
                        String nome = sc.nextLine();

                        lista.add(nome);

                        System.out.println("Nome adicionado!");
                        break;

                    case 2:
                        System.out.println("=== LISTA ===");

                        for (String item : lista) {
                            System.out.println(item);
                        }

                        break;

                    case 3:
                        System.out.println("Informe o nome que deseja remover:");
                        String nomeRemover = sc.nextLine();

                        lista.remove(nomeRemover);

                        System.out.println("Nome removido!");
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você deve digitar um número!");
                sc.nextLine();

            }
        }

        sc.close();
    }
}
