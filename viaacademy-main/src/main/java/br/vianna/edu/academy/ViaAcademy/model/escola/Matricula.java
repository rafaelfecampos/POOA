package br.vianna.edu.academy.ViaAcademy.model.escola;

import br.vianna.edu.academy.ViaAcademy.model.Aluno;
import jakarta.persistence.*;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Disciplina disciplina;

    private double nota, numeroFaltas;

}
