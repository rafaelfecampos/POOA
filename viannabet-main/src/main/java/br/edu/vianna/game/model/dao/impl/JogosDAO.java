package br.edu.vianna.game.model.dao.impl;

import br.edu.vianna.game.model.Jogo;
import br.edu.vianna.game.model.dao.GenericsDAO;

import java.util.Date;
import java.util.List;

public class JogosDAO extends GenericsDAO<Jogo, Integer> {
    @Override
    public void inserir(Jogo obj) throws Exception {

    }

    @Override
    public void alterar(Jogo obj) throws Exception {

    }

    @Override
    public void apagar(Jogo obj) throws Exception {

    }

    @Override
    public Jogo findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Jogo> findAll() throws Exception {
        try {
            return getCon()
                    .createQuery("select j from Jogo j order by j.dataJogo")
                    .getResultList();
        }catch (Exception e){
            throw new Exception("Erro ao consultar os jogos :: "+e.getMessage());
        }
    }

    public List<Jogo> findAllAguardando() throws Exception {
        try {
            return getCon()
                    .createQuery("select j from Jogo j " +
                            " Where j.dataJogo > :dt " +
                            "order by j.dataJogo")
                    .setParameter("dt", new Date())
                    .getResultList();
        }catch (Exception e){
            throw new Exception("Erro ao consultar os jogos :: "+e.getMessage());
        }
    }
}
