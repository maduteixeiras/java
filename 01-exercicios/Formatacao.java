public class Formatacao {
    public static void main(String[] args) {

        System.out.print("Olá ");
        System.out.print("Turma!");

        System.out.println();

        System.out.println("Aprendendo Java");
        System.out.println("Formatação de saída");

        // print = imprime na mesma linha
        // println = imprime e quebra a linha


        String nome = "Maria Eduarda";
        int idade = 17;

        System.out.printf("Nome: %s | Idade: %d", nome, idade);
    }
}