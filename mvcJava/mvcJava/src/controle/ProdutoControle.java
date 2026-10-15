package controle;

import java.util.ArrayList;

import dao.ProdutoDao;
import modelo.Produto;

public class ProdutoControle {

    private ProdutoDao dao;

    public ProdutoControle(){
        dao = new ProdutoDao();
    }
    // Cria o produto e envia para a camada Dao cadastrar
    public void cadastrar(int code, String name, double price){
        Produto produto = new Produto(code, name, price);
        dao.cadastrar(produto);
    }

    // Solicitar ao Dao a lista de produtos
    public ArrayList<Produto> listar(){
        return dao.listar();
    }

    public Produto buscar(int code){
        return dao.buscar(code);
    }

    public boolean alterar(int code, String name, double price){
        return dao.alterar(code, name, price);
    }

    public boolean remover(int code, String name, double price){
        return dao.remover(code);
    }
    
    
}
