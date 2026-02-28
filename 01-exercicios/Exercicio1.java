import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args){

        // Variáveis:
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // produção de saída de dados:
        System.out.println("Products:");
        System.out.printf("%s , which price is $ %.2f%n", product1, price1);
        System.out.println(product2 + ", which price is $" + price2);
        System.out.println("Record: " + age + "years old, code" + code + "and gender:" + gender);

        System.out.println("Measue with eigth decimal places: " + measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
        
    }
    
}

// Enunciado do exercício:
// 1. Declare e inicialize as seguintes variáveis:
// - product1 = "Computer"
// - product2 = "Office desk"  
// - age = 30
// - code = 5290
// - gender = 'F'      
// - price1 = 2100.0
// - price2 = 650.50
// - measure = 53.234567
// 2. Em seguida, produza a seguinte saída de dados:
// Products:
// Computer, which price is $ 2100.00
// Office desk, which price is $ 650.50
// Record: 30 years old, code 5290 and
// gender: F
// Measue with eigth decimal places: 53.23456700  
// Rouded (three decimal places): 53.235
// US decimal point: 53.235


