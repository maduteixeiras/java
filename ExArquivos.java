import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ExArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        
        while (op != 6) {
            System.out.println("Menu");
            System.out.println("1 - Criar Arquivo");
            System.out.println("2 - Escrever no arquivo");
            System.out.println("3 - Ler Arquivo");
            System.out.println("4 - Alterar Arquivo");
            System.out.println("5 - Remover Arquivo");
            System.out.println("6 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        File arquivo = new File("arquivo.txt");

                        if (arquivo.createNewFile()) {
                            System.out.println("Arquivo " + arquivo.getName() + " criado com sucesso!");
                            
                        }else {
                            System.out.println("Arquivo já existente!");
                        }
                    } catch (IOException e){
                        System.out.println("Erro");
                        e.printStackTrace();
                    }
                    
                    break;

                case 2:
                    try {
                        FileWriter wr = new FileWriter("arquivo.txt");
                        
                        System.out.println("Digite texto para inserir em arquivo.txt");
                        String conteudo = sc.nextLine();
                        wr.write(conteudo);
                        wr.close();

                        System.out.println("Adicionado com sucesso!");

                    } catch(IOException e){
                        System.out.println("Erro ao escrever:" + e.getMessage());
                    }

                    break;

                case 3:
                    try {
                        BufferedReader rd = new BufferedReader(new FileReader("arquivo.txt"));
                        String linha;

                        System.out.println("\nConteúdo do arquivo: ");
                        while ((linha = rd.readLine()) != null) {
                            System.out.println(linha);
                            System.out.println("\n");
                        }
                        rd.close();
                        
                        
                    } catch (IOException e) {
                        System.out.println("Erro ao ler:" + e.getMessage());
                    }

                    break;

                case 4:
                    try {
                        FileWriter fw = new FileWriter("arquivo.txt");

                        System.out.println("\nInforme o novo conteúdo do arquivo:");
                        String novoConteudo = sc.nextLine();
                        fw.write(novoConteudo);
                        fw.close();

                        System.out.println("Contúdo alterado com sucesso!");
                        
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        File arquivo = new File("arquivo.txt");
                        if (arquivo.delete()) {
                            System.out.println("Arquivo deletado com sucesso!");
                        } else {
                            System.out.println("Erro ao remover arquivo!");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
            
                default:
                    break;
            }
            
        }
        
        
    }
    
}
// Você deverá criar um programa em Java com um menu interativo, que permita realizar operações em um arquivo chamado "arquivo.txt".

// O sistema deve apresentar o seguinte menu:

// 1 - Criar arquivo
// 2 - Escrever no arquivo
// 3 - Ler arquivo
// 4 - Alterar arquivo
// 5 - Remover arquivo
// 6 - Sair
