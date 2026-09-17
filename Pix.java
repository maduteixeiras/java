public class Pix implements Pagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado via Pix");
        System.out.println("Valor Pago:" + valor);

    }
}