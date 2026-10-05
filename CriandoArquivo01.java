import java.io.File;
import java.io.IOException;


public class CriandoArquivo01 {
    public static void main(String[] args) {
        try{
            File arquivo = new File("exemplo.txt");
            if (arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existe!");
            }
        } catch(IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace(); // captura uma exceção e imprimi o histórico de onde o problema ocorreu no console. rasteia o erro (strack trace)
        }
    }
}