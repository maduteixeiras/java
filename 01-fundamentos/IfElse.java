import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hour ;

        System.out.println("Quantas horas são? ");
        hour = sc.nextInt();

        // encadeamento de estruturas condicionais if - else if - else
        if(hour < 12){
            System.out.println("Bom dia!");
        }
        else if(hour >= 18){
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Boa tarde!");
        }
        sc.close();

        }
}


