import java.util.Scanner;

public class Cond05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite senha: ");
        String senha = sc.next();


        if (senha.equals("Senha1234")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}



// Questão: 5-PROBLEMA: Controlar o acesso a uma porta usando uma senha pré-configurada no sistema.
// DADO DE ENTRADA: SENHA (variável alfanumérica)
// DADO DE SAÌDA: porta aberta (simulado com msg "PORTA ABERTA") ou mensagem de "SENHA NAO CONFERE"
// VARIÁVEIS: SENHA (tipo alfanumérica)
