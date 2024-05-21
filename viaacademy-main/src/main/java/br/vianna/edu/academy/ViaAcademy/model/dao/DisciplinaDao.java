package br.vianna.edu.academy.ViaAcademy.model.dao;

import br.vianna.edu.academy.ViaAcademy.model.Professor;
import br.vianna.edu.academy.ViaAcademy.model.escola.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaDao extends JpaRepository<Disciplina, Integer> {
}
