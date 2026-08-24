import java.util.Scanner;

public class MenuTabuadaContagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        int fimm;
        

        
        do{System.out.println("Escolha uma opção");
        System.out.println("1 - Calcular Tabuada");
        System.out.println("2 - Realizar Contagem");
        System.out.println("0 - Sair");

        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digíte um número: ");
                int numero = sc.nextInt();

                for (int i = 1; i <= 10; i++){
                    int calculo = numero * i;
                    System.out.println(numero + "x" + i + "=" + calculo);}
                break;

            case 2:
                System.out.println("Digite um número para finalizar a contagem: ");
                fimm = sc.nextInt();

                for (int i = 1; i <= fimm; i++) {
                    System.out.println(i);
                }
            default:
                if (op != 0) {
                    System.out.println("Opção inválida");
                    break;
                }}
        } while (op != 0);
        sc.close();
    }
    }
    
    

    


