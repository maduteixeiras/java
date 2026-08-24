package SaidaDeDados;
import java.util.Scanner;
import java.util.Locale;

public class NotaFiscal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nomeDoProduto = sc.nextLine();

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite o valor unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        sc.close();

        double total = quantidade * precoUnitario;

        System.out.printf("----- Nota Fiscal----- %n");
        System.out.printf("Cliente: %s %n", nomeDoCliente);
        System.out.printf("Produto: %s %n", nomeDoProduto);
        System.out.printf("Quantidade: %d %n", quantidade);
        System.out.printf("Preço Unitário: %.2f %n", precoUnitario);
        System.out.printf("Total: %.2f %n", total);

    }
    
}