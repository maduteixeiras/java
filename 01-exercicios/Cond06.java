import java.util.Scanner;

public class Cond06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite número 1: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite número 2: ");
        double numero2 = sc.nextDouble();

        System.out.println("Escolha um operador! Ex: +, -, *, /");
        String operador = sc.next();

        sc.close();

        if (operador.equals("+")) {
            double resultado = numero1 + numero2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if (operador.equals("-")) {
            double resultado = numero1 - numero2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if (operador.equals("*")) {
            double resultado = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if (operador.equals("/")) {
            if (numero2 != 0) {
                double resultado = numero1 / numero2;
                System.out.println("O resultado da divisão é: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operador inválido!");
        }



    }
}

 // Questão; 6-PROBLEMA: Entrar com dois números e na sequência uma operação aritmética. O resultado da operação sobre os dois números deve ser mostrado.
// DADOS DE ENTRADA: OPERANDO1(real), OPERANDO2 (real) e OPERADOR (caracter)
// DADOS DE SAÍDA: RESULTADO (real)