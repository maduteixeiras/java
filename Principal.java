import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do pagamento: R$ ");
        double valor = scanner.nextDouble();

        Pix pix = new Pix();
        pix.pagar(valor);

        scanner.close();
    }
}