package br.edu.vianna.game.model;

import java.time.LocalDateTime;

public class Usuario {
    private String nome, login, senha, email;
    private ETipoUsuario tipo;
    private LocalDateTime dataUltimoAcesso;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        nome = (login.equals("admin"))?"Administrador":"Usuário Apostador";
    }

    public Usuario(String nome, String login, String senha, String email, ETipoUsuario tipo, LocalDateTime dataUltimoAcesso) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ETipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(ETipoUsuario tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(LocalDateTime dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public boolean isValido() {
        return (login.equals("admin") && senha.equals("123"))
                ||
                (login.equals("user") && senha.equals("123"))
                ;
    }
}
