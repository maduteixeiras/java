package br.com.example.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.example.controle.ProdutoControle;
import br.com.example.modelo.Produto;

public class ProdutoView {
    private Scanner sc = new Scanner(System.in);
    private ProdutoControle controle = new ProdutoControle();

    public void menu() {
        int opcao;
        do {
            System.out.println("\n SISTEMA DE PRODUTOS");
            System.out.println(" 1 - Cadastrar");
            System.out.println(" 2 - Listar");
            System.out.println(" 3 - Buscar");
            System.out.println(" 4 - Alterar");
            System.out.println(" 5 - Remover");
            System.out.println(" 0 - Sair");
            System.out.println(" Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar(); break;
                case 2:
                    listar(); break;
                case 3:
                    buscar(); break;
                case 4:
                    alterar(); break;
                case 5:
                    remover(); break;
                case 0: System.out.println("Sistema encerrando"); break;
                default: System.out.println("Opção inválida");

            }
        } while (opcao!= 0);
        sc.close();
    }

    private void cadastrar (){
        System.out.println("\n -- Cadastro --");
        System.out.println("Código:");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Preço:");
        double preco = sc.nextDouble();

        if (controle.cadastrar(codigo, nome, preco)) {
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar.");
        }
    }

    private void listar() {
        System.out.println("\n-- Produtos ---");
        ArrayList<Produto> produtos = controle.listar();

        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");            
        } else {
            for (Produto produto : produtos) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
            }
        }
    }
    
    private void buscar(){
        System.out.println("Digite o código:");
        int codigo = sc.nextInt();
        Produto produto = controle.buscar(codigo);
        
        if (produto != null) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        }
    }

    private void alterar(){
        System.out.println("Código do produto:");
        int codigo = sc.nextInt();
        sc.nextLine();
        Produto produto = controle.buscar(codigo);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return ;
        } else {
            System.out.println("Novo nome:");
            String nome = sc.nextLine();

            System.out.println("Novo preço:");
            Double preco = sc.nextDouble();

            if (controle.alterar(codigo, nome, preco)) {
                System.out.println("Produto alterado");
            } else {
                System.out.println("Não foi possível alterar");
            }

        }
    }

    private void remover() {
    System.out.println("\n-- Remover Produto --");
    System.out.print("Digite o código do produto que deseja remover: ");
    int codigo = sc.nextInt();
    sc.nextLine();

    if (controle.remover(codigo)) {
        System.out.println("Produto removido com sucesso!");
    } else {
        System.out.println("Produto não encontrado para remoção.");
    }
}

        
    }

// Code sql:
// CREATE DATABASE mvc_produtos;
// USE mvc_produtos;
// CREATE TABLE produtos (
//     codigo INT PRIMARY KEY,
//     nome VARCHAR(100) NOT NULL,
//     preco DECIMAL(10,2) NOT NULL
// );
// SELECT * FROM produtos;
