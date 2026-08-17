import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = sc.nextLine();
        sc.close();

        if (nome.equals("Raquel") && senha.equals("1234")) {
            System.out.println("Acesso realizado com sucesso");
        } else if (nome.equals("Maria")&& senha.equals("5678")) {
            System.out.println("Acesso realizado com sucesso");
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
    
}

// O operador lógico "&&" (E) é utilizado para verificar se duas condições são verdadeiras ao mesmo tempo. No código acima, ele é usado para verificar se o nome e a senha fornecidos pelo usuário correspondem a um dos pares de credenciais válidos. Se ambas as condições forem verdadeiras, o acesso é concedido; caso contrário, o acesso é negado.
// O operador lógico "||" (OU) é utilizado para verificar se pelo menos uma das condições é verdadeira. Por exemplo, se quisermos permitir o acesso caso o nome seja "Raquel" ou a senha seja "1234", podemos usar o operador "||" para combinar essas condições. Se qualquer uma delas for verdadeira, o acesso será concedido.
// O operador lógico "!" (NÃO) é utilizado para inverter o valor de uma condição. Por exemplo, se quisermos negar uma condição, podemos usar o operador "!" antes dela. Se a condição for verdadeira, o operador "!" a tornará falsa, e vice-versa.
// o operador lógico "==" é utilizado para comparar valores primitivos, como números e caracteres. Ele verifica se os valores são iguais. No entanto, para comparar objetos, como strings, devemos usar o método equals(), que compara o conteúdo dos objetos em vez de suas referências na memória.
//  O operador lógico "!=" é utilizado para verificar se dois valores são diferentes. Ele retorna verdadeiro se os valores não forem iguais e falso caso contrário. Assim como o operador "==", ele é usado para comparar valores primitivos, enquanto para objetos devemos utilizar o método equals() para verificar a diferença de conteúdo
//  O operador lógico ">" é utilizado para verificar se um valor é maior que outro. Ele retorna verdadeiro se o valor à esquerda for maior que o valor à direita e falso caso contrário. Esse operador é comumente usado em comparações numéricas.
//  O operador lógico "<" é utilizado para verificar se um valor é menor que outro. Ele retorna verdadeiro se o valor à esquerda for menor que o valor à direita e falso caso contrário. Assim como o operador ">", ele é frequentemente usado em comparações numéricas.
// o operador lógico ">=" é utilizado para verificar se um valor é maior ou igual a outro. Ele retorna verdadeiro se o valor à esquerda for maior ou igual ao valor à direita e falso caso contrário. Esse operador é útil quando queremos incluir a igualdade na comparação.
// o operador lógico "<=" é utilizado para verificar se um valor é menor ou igual a outro. Ele retorna verdadeiro se o valor à esquerda for menor ou igual ao valor à direita e falso caso contrário. Assim como o operador ">=", ele é útil quando queremos incluir a igualdade na comparação.
// O operador lógico "?" (ternário) é utilizado para realizar uma verificação condicional em uma única linha de código. Ele possui a seguinte sintaxe: condição ? valor_se_verdadeiro : valor_se_falso. Se a condição for verdadeira, o valor_se_verdadeiro será retornado; caso contrário, o valor_se_falso será retornado. Esse operador é útil para simplificar expressões condicionais.

