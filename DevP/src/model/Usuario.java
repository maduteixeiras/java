package model;

public class Usuario {

    private String login;
    private String senha;

    public Usuario (String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    // getters e setter
    public String getLogin(){return this.login;}
    public void setLogin(String login){this.login = login;}

    public String getSenha(){return this.senha;}
    public void setSenha(String senha){ this.senha = senha;}
}