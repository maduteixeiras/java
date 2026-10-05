import java.io.FileReader;
import java.io.IOException;

public class CriandoArquivo05 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dado.txt");
            int caracter;

            while ((caracter = fr.read()) != -1) {
                System.out.println((char) caracter);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
