package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_time")
    private int id;
    private String nome;
    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date dataFuncacao;
}
