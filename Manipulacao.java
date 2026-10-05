import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import tryCatch.tryCatch;

public class Manipulacao {

    public static void main(String[] args) {

        // CRIAR
        try {
            File arquivo = new File("arquivo.txt");

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ESCREVER
        try {
            FileWriter writer = new FileWriter("arquivo.txt");

            writer.write("Olá, este é o conteúdo inicial");
            writer.write("\nLinha 2 do arquivo");
            writer.close();

            System.out.println("Conteúdo escrito com sucesso");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
        // LER ARQUIVO

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            System.out.println("\n Conteúdo do arquivo");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler:" + e.getMessage());
        }

        File arquivo = new File("arquivo.txt");
        if (arquivo.delete()) {
            System.out.println("Arquivo removido!");
        } else {
            System.out.println("Erro ao remover o arquivo.");
        }
    }
}