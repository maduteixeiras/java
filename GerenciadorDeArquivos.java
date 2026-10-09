import javax.swing.JOptionPane;

public class GerenciadorDeArquivos {
    public static void main(String[] args) {
        boolean executando = true;
    
        // Apresente as opções: 1 - Criar arquivo; 2 - Escrever no arquivo; 3 - Ler arquivo; 4 - Renomear
        // arquivo; 5 - Excluir arquivo; 6 - Mostrar informações do arquivo; 7 - Sair. O menu deverá continuar
        // sendo exibido até a opção Sair.
        while(executando) {
            String op = JOptionPane.showInputDialog(null, 
                "Escolha uma opção\n" +
                "1 - Criar arquivo\n" +
                "2 - Escrever no arquivo\n" +
                "3 - Ler arquivo\n" +
                "4 - Excluir arquivo\n" +
                "5 -  Excluir arquivo\n" +
                "6 - Mostrar informaçôes do arquivo\n" +
                "7 - Sair", 
                "Menu Principal", JOptionPane.QUESTION_MESSAGE);
        }
        
    }
}
