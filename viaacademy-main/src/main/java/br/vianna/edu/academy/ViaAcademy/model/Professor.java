package br.vianna.edu.academy.ViaAcademy.model;

import br.vianna.edu.academy.ViaAcademy.model.emn.EEspecializacao;
import br.vianna.edu.academy.ViaAcademy.model.escola.Disciplina;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Pessoa {

    @Enumerated(EnumType.STRING)
    private EEspecializacao especializacao;
    private double valorHoraAula;

    @Temporal(TemporalType.DATE)
    private Date dataContratacao;

    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;

}
