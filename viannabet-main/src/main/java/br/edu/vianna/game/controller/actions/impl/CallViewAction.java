package br.edu.vianna.game.controller.actions.impl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;

public class CallViewAction implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ac = (String) req.getAttribute("ac");
        ac = (ac == null)? req.getParameter("ac"): ac;


        RequestDispatcher rd;
        rd = req.getRequestDispatcher("template.jsp?pg="+ac);

        rd.forward(req, resp);
    }

    @Override
    public boolean ehPublico() {
        return true;
    }
}
