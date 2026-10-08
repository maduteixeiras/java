import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja confirmar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu sim!");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não!");
        }
    }
}
