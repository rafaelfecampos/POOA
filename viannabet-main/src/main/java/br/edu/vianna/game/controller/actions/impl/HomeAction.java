package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.controller.actions.ICommanderAction;
import br.edu.vianna.game.model.User;
import br.edu.vianna.game.model.Usuario;
import br.edu.vianna.game.model.dao.impl.JogosDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HomeAction  implements ICommanderAction {
    @Override
    public boolean ehPublico() {
        return true;
    }
    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u = (User) req.getSession().getAttribute("user");
        RequestDispatcher rd;

        if (u == null) {
            req.setAttribute("jogos", new JogosDAO().findAll());
            rd = req.getRequestDispatcher("template.jsp?pg=home");
        }else{
            rd = req.getRequestDispatcher("template.jsp?pg=homeLogado");
        }
        rd.forward(req, resp);
    }
}
