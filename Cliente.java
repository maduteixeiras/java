public class Cliente extends Pessoa implements Pagamento{

    public Cliente(String nome) {
        super(nome);
    }

    // Método da interface
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado: R$" +valor);
    }

    public void comprar(String produto, int quantidade, double valor){
        System.out.println("Produto comprado: "+produto);
        System.out.println("Quantidade comprada: "+quantidade);
        System.out.println("Valor unitário: "+valor);
        System.out.println("Total: "+(quantidade*valor));
        
    }

    
}
