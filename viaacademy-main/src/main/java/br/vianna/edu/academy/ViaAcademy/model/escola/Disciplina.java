package br.vianna.edu.academy.ViaAcademy.model.escola;

import br.vianna.edu.academy.ViaAcademy.model.Professor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 30, nullable = false)
    private String nome;

    private int cargaHoraria , ano, semestre;

    @ManyToOne
//    @JoinColumn(name = "id_professor")
    private Professor professor;


    @OneToMany(mappedBy = "disciplina")
    private List<Matricula> matriculas;

}
