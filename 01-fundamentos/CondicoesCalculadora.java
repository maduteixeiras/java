public class CondicoesCalculadora {
    public static void main(String [] args) {
        // envelopar: é o processo de pegar um valor primitivo e transformá-lo em um objeto. Acima, não poderiamos chamar o método sum diretamente com args[0] e args[1], pois eles são do tipo String. Então, precisamos convertê-los para int usando Integer.parseInt(), que é um processo de envelopamento.
        // Envelopando:
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Condicionais if - else (se - senão)
        // else depende da condição do if, else if depende da condição if ser false e da condição do else if ser true.
            if (args[0].equals("sum")) {
        sum(x, y);
        }   else if (args[0].equals("sub"))
        sub(x, y);
    } // Leitura : Se o primeiro argumento for igual a "sum", então chame o método sum com os argumentos x e y. Senão, se o primeiro argumento for igual a "sub", chame o método sub com os argumentos x e y.

    static void sum(int x, int y) {
        int result = x + y;
        System.out.println("The sum is: " + result);
    }

    static void sub(int x, int y) {
        int result = x - y;
        System.out.println("The subtraction is: " + result);
    }
}


// OPERADORES LÓGICOS BOOLEANOS:
// && - operador lógico AND (E)
// || - operador lógico OR (OU)
