package IfElse;
import java.util.Scanner;

public class Cond07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor do CD: ");
        String cor = sc.nextLine();

        sc.close();

        if (cor.equalsIgnoreCase("verde")) {
            System.out.println("O preço do CD é R$ 10,00");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.println("O preço do CD é R$ 20,00");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            System.out.println("O preço do CD é R$ 30,00");
        } else if (cor.equalsIgnoreCase("vermelho")) {
            System.out.println("O preço do CD é R$ 40,00");
        } else {
            System.out.println("Cor inválida. Por favor, digite uma cor válida.");
        }
    
    }
    
}

// Questão 7: Em uma loja de CD ́s existem apenas quatro tipos de preços que estão associados a cores. Assim os CD ́s que ficam na loja não são marcados por preços e sim por cores.
// Desenvolva o algoritmo que a partir a entrada da cor o software mostre o preço. A loja está atualmente com a seguinte tabela de preços