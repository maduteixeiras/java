package dao;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    // Banco de dados em memória para os produtos
    private static List<Produto> listaProdutos = new ArrayList<>();

    public void salvar(Produto p) {
        listaProdutos.add(p);
    }

    public List<Produto> listarTodos() {
        return listaProdutos;
    }

    public Produto buscarPorId(int id) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public boolean alterar(Produto produtoAtualizado) {
        Produto p = buscarPorId(produtoAtualizado.getId());
        if (p != null) {
            p.setNome(produtoAtualizado.getNome());
            p.setCategoria(produtoAtualizado.getCategoria());
            p.setPreco(produtoAtualizado.getPreco());
            p.setQuantidade(produtoAtualizado.getQuantidade());
            return true;
        }
        return false;
    }

    public boolean remover(int id) {
        Produto p = buscarPorId(id);
        if (p != null) {
            return listaProdutos.remove(p);
        }
        return false;
    }
}
