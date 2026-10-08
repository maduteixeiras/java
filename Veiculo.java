public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // metodos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDetalhes() {

    }
}

// Classe Veiculo (Classe Pai)

// Crie uma classe chamada Veiculo com os seguintes atributos:

// marca
// modelo
// ano

// A classe deve conter:

// Construtor
// Métodos getters
// Método exibirDetalhes()