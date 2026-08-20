import java.util.Scanner;

public class Wh03 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String senha = "";
    
    // "Enquanto a senha NÃO for igual a 1234..."
    while (!senha.equals("1234")) {
        System.out.println("Informe a senha: ");
        senha = sc.nextLine();

    }
    System.out.println("Aceso permitido!");
    sc.close();
    }
}
