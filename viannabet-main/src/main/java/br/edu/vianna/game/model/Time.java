package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_time")
    private int id;
    @Column(length = 20, nullable = false)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date dataFundacao;
    @OneToMany(mappedBy = "time1")
    private List<Jogo> jogosComoTime1;
    @OneToMany(mappedBy = "time2")

    private List<Jogo> jogosComoTime2;

    public Time() {
    }

    public Time(int id, String nome, Date dataFundacao) {
        this.id = id;
        this.nome = nome;
        this.dataFundacao = dataFundacao;
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

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
