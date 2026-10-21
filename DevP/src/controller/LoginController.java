package controller;

import dao.UsuarioDAO;
import model.Usuario;

public class LoginController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean autenticar(String login, String senha) {
        Usuario u = usuarioDAO.buscarPorLogin(login);
        return u != null && u.getSenha().equals(senha);
    }
}
