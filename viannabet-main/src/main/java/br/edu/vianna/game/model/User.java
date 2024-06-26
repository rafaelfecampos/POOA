package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USUARIO")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id;
    @Column(length = 30, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private String login;
    @Column(length = 40, nullable = false)
    private String senha;
    @Column(length = 50, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ETipoUsuario tipo;
    private double saldo;

    @OneToMany(mappedBy = "apostador")
    private List<Aposta> minhasApostas;

    public User() {
        nome = "";
        login = "";
        email = "";
    }

    public User(int id, String nome, String login, String senha, String email, ETipoUsuario tipo, double saldo, List<Aposta> minhasApostas) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
        this.saldo = saldo;
        this.minhasApostas = minhasApostas;
    }

    public boolean isAdmin(){
        return tipo == ETipoUsuario.ADMIN;
    }
    public boolean isApostador(){
        return tipo == ETipoUsuario.APOSTADOR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSaldo() {
        return saldo;
    }

    public List<Aposta> getMinhasApostas() {
        return minhasApostas;
    }

    public void depositar(double valor){
        if (valor >0 ){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor >0 && valor <= saldo ){
            saldo -= valor;
        }
    }
}
