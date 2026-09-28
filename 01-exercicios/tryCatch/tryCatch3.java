package tryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class tryCatch3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Informe um número inteiro: ");
            int inteiro = scanner.nextInt();

            System.out.println("Você digitou o número "+ inteiro);
        }catch(InputMismatchException e){
            System.out.println("Você deve digitar um número inteiro.");
        }
        scanner.close();
    }
    
}
