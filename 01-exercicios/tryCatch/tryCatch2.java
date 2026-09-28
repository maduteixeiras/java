package tryCatch;
public class tryCatch2 {
    public static void main(String[] args) {
        
    
    int[] numeros = {10, 20, 30};

    try{
        System.out.println(numeros[5]);
    }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro: índice fora do limite.");
    }finally{
        System.err.println("Fim do programa!");
    }
}
}
