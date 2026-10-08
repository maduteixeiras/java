public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ExibirDetalhes() {
        System.out.println("Detalher do vceículo:\n" +
            "Marca: " + marca +
            "\nModelo: " + modelo +
            "\nAno: " + ano
        );
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