package dao;

import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDao {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listar() {
        return produtos;
    }

    public Produto buscar(int code) {
        for (Produto produto : produtos) {
            if (produto.getCode() == code) {
                return produto; // Retorna o produto assim que o encontra
            }
        }
        return null;
    }

    public boolean alterar(int code, String name, double price){
        Produto produto = buscar(code);

        if (produto != null) {
            produto.setName(name);
            produto.setPrice(price);
            return true;
        }

        return false;
    }

    public boolean remover(int code) {
        Produto produto = buscar(code);

        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }
    
}