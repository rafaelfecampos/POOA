package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aposta")
    private int id;
    private double valorApostado;
    @Enumerated(EnumType.STRING)
    private ETipoResultado palpite;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataAposta;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User apostador;

    @ManyToOne
    @JoinColumn(name = "id_jogo")
    private Jogo jogo;

    public Aposta() {
    }

    public Aposta(int id, double valorApostado, ETipoResultado palpite, Date dataAposta, User apostador, Jogo jogo) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.palpite = palpite;
        this.dataAposta = dataAposta;
        this.apostador = apostador;
        this.jogo = jogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(double valorApostado) {
        this.valorApostado = valorApostado;
    }

    public ETipoResultado getPalpite() {
        return palpite;
    }

    public void setPalpite(ETipoResultado palpite) {
        this.palpite = palpite;
    }

    public Date getDataAposta() {
        return dataAposta;
    }

    public void setDataAposta(Date dataAposta) {
        this.dataAposta = dataAposta;
    }

    public User getApostador() {
        return apostador;
    }

    public void setApostador(User apostador) {
        this.apostador = apostador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
