package br.edu.vianna.game.model.dao.impl;

import br.edu.vianna.game.model.User;
import br.edu.vianna.game.model.dao.GenericsDAO;

import javax.persistence.NamedQuery;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import java.util.List;

public class UserDAO extends GenericsDAO<User, Integer> {


    @Override
    public void inserir(User obj) throws Exception {
        try {
            getCon().getTransaction().begin();
            getCon().persist(obj);
            getCon().getTransaction().commit();
        }catch (Exception e){
            throw new Exception("Erro ao Salvar o usuário :: "+e.getMessage());
        }
    }

    @Override
    public void alterar(User obj) throws Exception {
        try {
            getCon().getTransaction().begin();
            getCon().merge(obj);
            getCon().getTransaction().commit();
        }catch (Exception e){
            throw new Exception("Erro ao alterar o usuário :: "+e.getMessage());
        }
    }

    @Override
    public void apagar(User obj) throws Exception {
        try {
            getCon().getTransaction().begin();
            getCon().remove(obj);
            getCon().getTransaction().commit();
        }catch (Exception e){
            throw new Exception("Erro ao apagar o usuário :: "+e.getMessage());
        }
    }

    @Override
    public User findById(Integer id) throws Exception {
        try {
            User u = new User();
            u.setId(id);
            return getCon().find(User.class,u);
        }catch (Exception e){
            throw new Exception("Erro ao consultar o usuário :: "+e.getMessage());
        }
    }

    public User findByLoginAndSenha(String login, String senha) throws Exception {
        try {
            //JPQL
            Query query =  getCon().createQuery("select u from User u where " +
                    "u.login = :log and u.senha = :sen");

            query.setParameter("log", login);
            query.setParameter("sen", senha);

            return (User) query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }catch (NonUniqueResultException e){
            throw new Exception("Mais de um usuário encontrado ");
        }catch (Exception e){
            throw new Exception("Erro ao consultar o usuário :: "+e.getMessage());
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        try {
            //select * from usuario
            //JPQL
            //select u from User u where u.aposta.pontuacao == 10
            return getCon().createQuery("select u from User u").getResultList();
        }catch (Exception e){
            throw new Exception("Erro ao consultar o usuário :: "+e.getMessage());
        }
    }
}
