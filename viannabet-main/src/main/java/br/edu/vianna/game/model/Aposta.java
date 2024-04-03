package br.edu.vianna.game.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Aposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aposta")
    private int id;
    private double valorAposta;
    @Enumerated(EnumType.STRING)
    private ETipoResultado palpite;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateAposta;
    @ManyToMany
    private User apostador;

    private Jogo jogo;
}
