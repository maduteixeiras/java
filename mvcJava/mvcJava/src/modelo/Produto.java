package modelo;

public class Produto {
    private int code;
    private String name;
    private double price;   

    // Construtor padrão
    public Produto() {

    }

    // Construtor com parâmetros
    public Produto(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}