package modelo;

// Representar os dados do cliente com atributos privados, construtor com parâmetros e métodos getters e setters.
public class Cliente {

    private int codigo;
    private String nome;
    private String telefone;
    private String email;

    public Cliente( int codigo, String nome,  String telefone, String email){
        this.codigo = codigo;
        this.nome = nome; 
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    
}
