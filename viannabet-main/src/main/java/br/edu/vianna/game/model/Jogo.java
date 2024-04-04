package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataJogo;

    @Column(nullable = false)
    private double oddsTime1, oddsTime2, oddsEmpate;

    @Column(nullable = false)
    private int golsTime1, getGolsTime2;

    private ETipoResultado resultado;
    @ManyToOne
    @JoinColumn(name = "id_time1")
    private Time time1;
    @ManyToOne
    @JoinColumn(name = "id_time2")
    private Time time2;
}
