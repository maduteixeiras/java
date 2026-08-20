import java.util.Scanner;
public class Dw04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        do {
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Carregar Jogo");
        System.out.println("3 - Configurações");
        System.out.println("0 - Sair ");
        System.out.println("Escolha uma opção");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Iniciando jogo: ");
                break;
            case 2:
                System.out.println("Carregando jogo: ");
            case  3:
                System.out.println("Configurando");
            case 0:
                break;
            default:
                System.out.println("Opção do menu inválida!");
                break;
        }
        }while (op!=4);
        sc.close();
        
    }
    
}
