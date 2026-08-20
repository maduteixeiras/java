import java.util.Scanner;

public class MenuMochilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Escolar");
            System.out.println("2 - Viagem");
            System.out.println("3 - Esportiva");
            System.out.println("0 - Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Compacta e ideal para estudantes!");
                    break;

                case 2:
                    System.out.println("Espaçosa e ideal para longas viagens!");
                    break;

                case 3:
                    System.out.println("Leve, resistente e ergonômica");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}
