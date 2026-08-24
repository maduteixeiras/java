package For;
import java.util.Scanner;
public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("%nInforme o %d ° número%n", i);
            int numero = sc.nextInt();
            System.out.printf("O número informado é %d%n", numero);

        }
        sc.close();
    }
    
}
