package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataJogo;
    @Column(nullable = false)
    private double oddsTime1, oddsTime2, oddsEmpate;
    @Column(nullable = false)
    private int golsTime1, golsTime2;
    @Enumerated(EnumType.STRING)
    private ETipoResultado resultado;

    @ManyToOne
    @JoinColumn(name = "id_time1")
    private Time time1;

    @ManyToOne
    @JoinColumn(name = "id_time2")
    private Time time2;

    public Jogo() {
    }

    public Jogo(int id, Date dataJogo, double oddsTime1, double oddsTime2, double oddsEmpate, int golsTime1, int golsTime2, ETipoResultado resultado, Time time1, Time time2) {
        this.id = id;
        this.dataJogo = dataJogo;
        this.oddsTime1 = oddsTime1;
        this.oddsTime2 = oddsTime2;
        this.oddsEmpate = oddsEmpate;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        this.resultado = resultado;
        this.time1 = time1;
        this.time2 = time2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(Date dataJogo) {
        this.dataJogo = dataJogo;
    }

    public double getOddsTime1() {
        return oddsTime1;
    }

    public void setOddsTime1(double oddsTime1) {
        this.oddsTime1 = oddsTime1;
    }

    public double getOddsTime2() {
        return oddsTime2;
    }

    public void setOddsTime2(double oddsTime2) {
        this.oddsTime2 = oddsTime2;
    }

    public double getOddsEmpate() {
        return oddsEmpate;
    }

    public void setOddsEmpate(double oddsEmpate) {
        this.oddsEmpate = oddsEmpate;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }

    public ETipoResultado getResultado() {
        return resultado;
    }

    public void setResultado(ETipoResultado resultado) {
        this.resultado = resultado;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }
}
