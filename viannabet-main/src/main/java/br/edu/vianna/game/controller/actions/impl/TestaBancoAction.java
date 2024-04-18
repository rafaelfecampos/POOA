package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.ETipoUsuario;
import br.edu.vianna.game.model.User;
import br.edu.vianna.game.model.dao.impl.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class TestaBancoAction implements br.edu.vianna.game.controller.actions.ICommanderAction {


    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        EntityManagerFactory emf = Persistence
//                .createEntityManagerFactory("bet_PU");
//
//        EntityManager em = emf.createEntityManager();
//
//        resp.getWriter().println(em.getMetamodel().toString());

        User u = new User(1,"zezin", "ze","123","ze@ze", ETipoUsuario.APOSTADOR,
                1000,null);

        try {
            new UserDAO().inserir(u);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
