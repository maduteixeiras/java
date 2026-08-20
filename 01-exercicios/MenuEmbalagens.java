import java.util.Scanner;
public class MenuEmbalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {System.out.println("Escolha uma opção: ");
        System.out.println("1 - Caixa de Papelão");
        System.out.println("2 - Sacola Plastica");
        System.out.println("3  Embalagem de vidro");
        System.out.println("0 - Sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ideal para transporte e armazenamento");
                break;

            case 2:
                System.out.println("Leve e prática, mas poucvo sustentável");
                break;

            case 3:
                System.out.println("Resistente e reutilizável");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }while (op != 0);
        
    sc.close();
    }

        
}
    

