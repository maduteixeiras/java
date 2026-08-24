import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digíte um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int calculo = numero * i;
            System.out.println(numero + "x" + i + "=" + calculo);
        }

        
        sc.close();
        
    }
}