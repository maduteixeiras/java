import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "infome o seu nome: ");
        String nome = sc.nextLine();
        nome=nome. toUpperCase ();
        System.out.println("Nome em maiusculo: "+nome);

        String nome2 ="Anderson";
        System.out.println(nome2.toUpperCase());
    }
}
