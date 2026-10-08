import javax.swing.JOptionPane;


public class Carro extends Veiculo {


    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // (polimorfismo)
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null,
            "Marca: " + this.getMarca() + 
            "\nModelo: " + this.getModelo() + 
            "\nAno: " + this.getAno(), 
            "Detalhes do Veículo", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }


    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " | Modelo: " + this.getModelo() + " | Ano: " + this.getAno();
    }
}
// Classe Carro (Classe Filha)

// Crie uma classe chamada Carro que herda de Veiculo.

// A classe deve:

// Utilizar o construtor da classe pai
// Sobrescrever o método exibirDetalhes() (polimorfismo)

