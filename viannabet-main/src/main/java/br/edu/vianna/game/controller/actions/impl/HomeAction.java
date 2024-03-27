package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.controller.actions.ICommanderAction;
import br.edu.vianna.game.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HomeAction implements ICommanderAction {

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario u = (Usuario) req.getSession().getAttribute("user");
        RequestDispatcher rd;
        if (u == null) {
            rd = req.getRequestDispatcher("template.jsp?pg=home");
        }else{
            rd = req.getRequestDispatcher("template.jsp?pg=homeLogado");
        }
        rd.forward(req, resp);
    }

    @Override
    public boolean ehPublico() {
        return false;
    }
}
