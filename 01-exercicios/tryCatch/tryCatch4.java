package tryCatch;
import java.util.Scanner;
public class tryCatch4 {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){ // Estamos criando um Scanner dentro de um try-with-resources - O Java vai fechar automaticamente o Scanner quando terminar o bloco try.
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            if(nome.trim().isEmpty()) { // .trim : remove espaços no início e no final da String. isEmpty() : Verifica se a String está vazia.
                throw new Exception("O campo nome não pode estar vazio."); // Se o nome estiver vazio, essa linha lança uma exceção manualmente. throw significa, basicamente: Aconteceu uma situação que considero um erro; vou lançar uma exceção."
            }
            System.out.println("O nome digitado foi: "+ nome);
        }catch(Exception e){
            System.out.println("ERRO:" +e.getMessage()); //pega a mensagem que foi colocada na exceção.
        }
    }
    
}
