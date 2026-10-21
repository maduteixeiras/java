package view;

import controller.LoginController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private LoginController loginController = new LoginController();

    public TelaLogin() {
        setTitle("Acesso ao Sistema");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel(" Usuário:"));
        txtUsuario = new JTextField();
        add(txtUsuario);

        add(new JLabel(" Senha:"));
        txtSenha = new JPasswordField();
        add(txtSenha);

        add(new JLabel("")); // Espaço vazio
        btnEntrar = new JButton("Entrar");
        add(btnEntrar);

        btnEntrar.addActionListener((ActionEvent e) -> acaoLogin());
    }

    private void acaoLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        if (loginController.autenticar(usuario, senha)) {
            JOptionPane.showMessageDialog(this, "Login efetuado!");
            new TelaProduto().setVisible(true); // Abre a tela do CRUD
            this.dispose(); // Fecha a tela de login
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}
