import java.util.Scanner;
public class MenuCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {System.out.println("Escolha uma opção: ");
        System.out.println("1 - Caneta Esferográfica");
        System.out.println("2 - Caneta de Gel");
        System.out.println("3 - Caneta Tinteiro");
        System.out.println("0 - Sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Econômica e de longa duração");
                break;

            case 2:
                System.out.println("Tinta mais pigmentada e escrita suave");
                break;

            case 3:
                System.out.println("Clássica e elegante, usada para caligrafia");
                break;

            default:
                System.out.println("Opção inválida");
                break;
    
        }
    }while (op != 0);
        
    sc.close();
    }

        
}
    

