package br.vianna.edu.academy.ViaAcademy.model;


import br.vianna.edu.academy.ViaAcademy.model.escola.Matricula;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends Pessoa {

    @Column(length = 12)
    private String matricula;
    private double valorMensalidade;

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> historico;

}
