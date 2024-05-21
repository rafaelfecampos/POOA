package br.vianna.edu.academy.ViaAcademy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome, email, login, senha;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimoAcesso;

}
