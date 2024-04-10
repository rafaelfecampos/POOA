package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CallUserView implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("user", new User());
        RequestDispatcher rd = req.getRequestDispatcher("template.jsp?pg=cadUser");

        rd.forward(req, resp);
    }
}
