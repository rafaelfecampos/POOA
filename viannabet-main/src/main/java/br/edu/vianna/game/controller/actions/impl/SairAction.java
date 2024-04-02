package br.edu.vianna.game.controller.actions.impl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SairAction implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public boolean ehPublico() {
        return false;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        new HomeAction().executar(req, resp);
    }
}
