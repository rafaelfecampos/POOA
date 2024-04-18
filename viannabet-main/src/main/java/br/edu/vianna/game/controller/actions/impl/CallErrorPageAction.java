package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.controller.actions.ICommanderAction;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CallErrorPageAction implements ICommanderAction {
    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("template.jsp?pg=Error");
        rd.forward(req, resp);
    }
}
