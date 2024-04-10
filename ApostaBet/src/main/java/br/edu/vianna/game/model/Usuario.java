package br.edu.vianna.game.model;

import java.time.LocalDateTime;

public class Usuario {
    private String nome, login, senha, email;
    private ETipoUsuario tipoUsuario;
    private LocalDateTime dataUltimoAcesso;
    public Usuario(){}

    public Usuario(String nome, String login, String senha, String email, ETipoUsuario tipoUsuario, LocalDateTime dataUltimoAcesso) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
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

    public ETipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(ETipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public LocalDateTime getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(LocalDateTime dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public boolean ehValido() {
        return login.equals("admin") && senha.equals("123");
    }
}
