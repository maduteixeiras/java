import java.util.Scanner;
import java.util.Locale;

public class EntradaDados {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // PARA LER TIPO STRING: sc.next();
        System.out.println("Informe seu nome: "); // Mostra o que o usuário deve fazer
        String name = sc.next(); // realiza a leitura do que o usuário digitou e armazena na variável 'name' do tipo String
        System.out.println("Olá, " + name); // Mostra na tela a mensagem Ola, + o nome do usuário que foi armazenado na variável 'name'

        // LER TIPO INTEIRO: sc.nextInt();
        System.out.println("Informe sua idade: ");
        int age = sc.nextInt(); // realiza a leitura do que o usuário digitou e armazena na variável 'age' do tipo int
        System.out.printf("%s tem %d anos%n", name, age);

        // LER TIPO DOUBLE: sc.nextDouble();
        System.out.println("Informe sua altura: ");
        double height = sc.nextDouble(); // realiza a leitura do que o usuário digitou e armazena na variável 'height' do tipo double
        System.out.println("Você tem " + height + "m de altura");

        sc.close(); // fecha o scanner para evitar vazamento de memória
    }
}

// entrada de dados em java necessita criar um objeto da classe Scanner.
// Scaner sc = new Scanner(System.in); == Variavel 'sc' do tipo scanner (tipo especial para entrada de dados) recebe e é associada ao teclado no modo console
// Para essa variável funcionar é necessario na primeira linha de código importar a classe scanner com import java.util.Scanner;
// e também será necessário fechar o scanner no final do código com sc.close(); para evitar vazamento de memória.