import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CriandoArquivo03 {
    public static void main(String[] args) {
        try {
            File arquivo = new File("exemplo.txt");
            Scanner sc = new Scanner(arquivo);

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não existe!");
            e.printStackTrace();
        }
    }
}
