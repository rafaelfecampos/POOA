package br.vianna.edu.academy.ViaAcademy.model.dao;

import br.vianna.edu.academy.ViaAcademy.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

    public Aluno findByMatricula(String matricula);
}
