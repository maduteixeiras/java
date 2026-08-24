package For;
import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mult = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, mult);
        }

        sc.close();
    }
}