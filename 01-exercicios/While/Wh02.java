import java.util.Scanner;

public class Wh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número limite: ");
        int limite = sc.nextInt();
        sc.close();

        int numero = 1;
        while(numero<= limite) {
            System.out.println(numero);
            numero++;
        }
    }
    
}
