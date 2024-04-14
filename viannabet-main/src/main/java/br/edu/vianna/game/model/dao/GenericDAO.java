package br.edu.vianna.game.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public abstract class GenericDAO<C, K> {
    private EntityManager con;
    public GenericDAO(){
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("bet_PU");
        con = emf.createEntityManager();
    }
    public EntityManager getCon(){
        return con;
    }

    public abstract void inserir(C obj) throws Exception;
    public abstract void alterar(C obj) throws Exception;
    public abstract void apagar(C obj) throws Exception;
    public abstract C findById(K id) throws Exception;
    public abstract List<C> findAll() throws Exception;
}
