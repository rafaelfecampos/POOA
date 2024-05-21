package br.vianna.edu.academy.ViaAcademy.model.dao;

import br.vianna.edu.academy.ViaAcademy.model.escola.Disciplina;
import br.vianna.edu.academy.ViaAcademy.model.escola.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaDao extends JpaRepository<Matricula, Integer> {
}
