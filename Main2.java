import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome do cliente: ");
        String nome = scanner.nextLine();

        Cliente cliente = new Cliente(nome);
        cliente.mostrarDados();

        System.out.println("Informe o nome do produto:");
        String produto = scanner.nextLine();

        System.out.println("Informe a quantidade do produto:");
        int quantidade = scanner.nextInt();

        System.out.println("Informe o valor do produto:");
        double valor = scanner.nextDouble();

        System.out.println("-- Compras --");
        cliente.comprar(produto, quantidade, valor);

        double total = quantidade*valor;

        System.out.println("== Pagamento ==");
        cliente.pagar(total);

        scanner.close();
    }
    
}

