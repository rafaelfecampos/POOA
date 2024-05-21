package br.vianna.edu.academy.ViaAcademy.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosImc {

    private String nome;

    private double peso, altura;

}
