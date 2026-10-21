package dao;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    static {
        listaUsuarios.add(new Usuario("admin", "admin"));
    }

    public Usuario buscarPorLogin(String login) {
        for (Usuario u : listaUsuarios) {
            if (u.getLogin().equals(login)) {
                return u;
            }
        }
        return null;
    }
}
