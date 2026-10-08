import javax.swing.JOptionPane;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano ) {
        super(marca, modelo, ano);
    }

    @Override
    public void ExibirDetalhes() {
        JOptionPane.showMessageDialog(null, "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano );
    }

}

// Classe Carro (Classe Filha)

// Crie uma classe chamada Carro que herda de Veiculo.

// A classe deve:

// Utilizar o construtor da classe pai
// Sobrescrever o método exibirDetalhes() (polimorfismo)

