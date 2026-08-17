import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {

        // Variáveis:
        String product = "TV";
        int model = 17;
        double price = 271.8745783;


        // Concatenando elementos(texto e variável) em uma mesmo comando de escrita:
        // Usando PRINTLN:
        System.out.println("Usando PrintLN:");
        System.out.println("Product: " + product);
        System.out.println("Model: " + model);
        // Usando PRINTF:
        Locale.setDefault(Locale.US); // Configuração de localidade para US para exibir o ponto como separador decimal:
        System.out.printf("Price: %.2f on promotion! %n", price);
        
        System.out.println("Usando PrintF:");
        System.out.printf("Product: %s%n Model: %d%n Price: %.2f%n", product, model, price);

    }
}

// %f = float/double
// %d = int
// %s = string
// %n = quebrar linha (new line)
