
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorDeArquivos {

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {

            String op = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:\n\n" +
                "1 - Criar arquivo\n" +
                "2 - Escrever no arquivo\n" +
                "3 - Ler arquivo\n" +
                "4 - Renomear arquivo\n" +
                "5 - Excluir arquivo\n" +
                "6 - Mostrar informações do arquivo\n" +
                "7 - Sair",
                "Menu Principal",
                JOptionPane.QUESTION_MESSAGE
            );

            if (op == null) {
                break;
            }

            switch (op) {

                case "1": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome do arquivo:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    try {
                        if (arquivo.createNewFile()) {
                            JOptionPane.showMessageDialog(
                                null, "Arquivo criado com sucesso!"
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                null, "O arquivo já existe."
                            );
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(
                            null, "Erro ao criar o arquivo: " + e.getMessage()
                        );
                    }
                    break;
                }

                case "2": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome do arquivo:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    if (!arquivo.isFile()) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo não encontrado."
                        );
                        break;
                    }

                    String texto = JOptionPane.showInputDialog(
                        "Digite o conteúdo que deseja escrever:"
                    );

                    if (texto == null) {
                        break;
                    }

                    try (BufferedWriter escritor = new BufferedWriter(
                            new FileWriter(arquivo, true))) {

                        escritor.write(texto);
                        escritor.newLine();

                        JOptionPane.showMessageDialog(
                            null, "Texto escrito com sucesso!"
                        );

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(
                            null, "Erro ao escrever: " + e.getMessage()
                        );
                    }
                    break;
                }

                case "3": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome do arquivo que deseja ler:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    if (!arquivo.isFile()) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo não encontrado."
                        );
                        break;
                    }

                    StringBuilder conteudo = new StringBuilder();

                    try (BufferedReader leitor = new BufferedReader(
                            new FileReader(arquivo))) {

                        String linha;

                        while ((linha = leitor.readLine()) != null) {
                            conteudo.append(linha).append("\n");
                        }

                        JOptionPane.showMessageDialog(
                            null,
                            conteudo.length() == 0
                                ? "O arquivo está vazio."
                                : conteudo.toString(),
                            "Conteúdo do arquivo",
                            JOptionPane.INFORMATION_MESSAGE
                        );

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(
                            null, "Erro ao ler: " + e.getMessage()
                        );
                    }
                    break;
                }

                case "4": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome atual do arquivo:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    if (!arquivo.isFile()) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo não encontrado."
                        );
                        break;
                    }

                    String novoNome = JOptionPane.showInputDialog(
                        "Digite o novo nome do arquivo:"
                    );

                    if (novoNome == null || novoNome.trim().isEmpty()) {
                        break;
                    }

                    File novoArquivo = new File(novoNome);

                    if (novoArquivo.exists()) {
                        JOptionPane.showMessageDialog(
                            null, "Já existe um arquivo com esse nome."
                        );
                        break;
                    }

                    if (arquivo.renameTo(novoArquivo)) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo renomeado com sucesso!"
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                            null, "Não foi possível renomear o arquivo."
                        );
                    }
                    break;
                }

                case "5": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome do arquivo que deseja excluir:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    if (!arquivo.isFile()) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo não encontrado."
                        );
                        break;
                    }

                    int confirmacao = JOptionPane.showConfirmDialog(
                        null,
                        "Tem certeza de que deseja excluir o arquivo?",
                        "Confirmar exclusão",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (confirmacao == JOptionPane.YES_OPTION) {
                        if (arquivo.delete()) {
                            JOptionPane.showMessageDialog(
                                null, "Arquivo excluído com sucesso!"
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                null, "Não foi possível excluir o arquivo."
                            );
                        }
                    }
                    break;
                }

                case "6": {
                    String nome = JOptionPane.showInputDialog(
                        "Digite o nome do arquivo:"
                    );

                    if (nome == null || nome.trim().isEmpty()) {
                        break;
                    }

                    File arquivo = new File(nome);

                    if (!arquivo.isFile()) {
                        JOptionPane.showMessageDialog(
                            null, "Arquivo não encontrado."
                        );
                        break;
                    }

                    String informacoes =
                        "Nome: " + arquivo.getName() + "\n" +
                        "Caminho: " + arquivo.getAbsolutePath() + "\n" +
                        "Tamanho: " + arquivo.length() + " bytes\n" +
                        "É um arquivo: " + arquivo.isFile() + "\n" +
                        "Pode ser lido: " + arquivo.canRead() + "\n" +
                        "Pode ser escrito: " + arquivo.canWrite() + "\n" +
                        "Última modificação: " +
                        new java.util.Date(arquivo.lastModified());

                    JOptionPane.showMessageDialog(
                        null,
                        informacoes,
                        "Informações do arquivo",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }

                case "7":
                    executando = false;

                    JOptionPane.showMessageDialog(
                        null, "Programa encerrado!"
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Opção inválida! Escolha de 1 a 7."
                    );
                    break;
            }
        }
    }
}
