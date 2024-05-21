package br.vianna.edu.academy.ViaAcademy.model.dao;

import br.vianna.edu.academy.ViaAcademy.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorDao extends JpaRepository<Professor, Integer> {

    public List<Professor>  findByLogin(String login);
    public Professor  findByLoginAndSenha(String login, String senha);

}
