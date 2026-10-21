package controller;

import dao.ProdutoDAO;
import model.Produto;
import java.util.List;

public class ProdutoController {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public boolean cadastrar(int id, String nome, String categoria, double preco, int qtd) {
        if (produtoDAO.buscarPorId(id) != null) return false; // ID já existe
        produtoDAO.salvar(new Produto(id, nome, categoria, preco, qtd));
        return true;
    }

    public List<Produto> listar() {
        return produtoDAO.listarTodos();
    }

    public Produto pesquisar(int id) {
        return produtoDAO.buscarPorId(id);
    }

    public boolean atualizar(int id, String nome, String categoria, double preco, int qtd) {
        return produtoDAO.alterar(new Produto(id, nome, categoria, preco, qtd));
    }

    public boolean excluir(int id) {
        return produtoDAO.remover(id);
    }
}
