package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class VerificaLoginAction implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario user = new Usuario(req.getParameter("cpLogin"),
                        req.getParameter("cpSenha"));

        if (user.isValido()) {
            req.getSession().setAttribute("user", user);
            new HomeAction().executar(req, resp);
        } else {
            req.setAttribute("msg", "Login ou Senha Incorreta");
            new CallViewAction().executar(req, resp);
        }
    }
}
