import java.util.Scanner;
import java.util.Locale;

public class Boletim {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDoAluno = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        sc.close();

        double media = (primeiraNota + segundaNota) / 2;
        System.out.printf("Aluno: %s%nNota 1: %.2f%nNota 2: %.2f%nMédia: %.2f%n", nomeDoAluno, primeiraNota, segundaNota, media);

        
    }
    
}