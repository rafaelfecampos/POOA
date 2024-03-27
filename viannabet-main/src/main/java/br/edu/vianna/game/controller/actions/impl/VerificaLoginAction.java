package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class VerificaLoginAction implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario user = new Usuario(req.getParameter("cpLogin"),
                req.getParameter("cpSenha"));

        RequestDispatcher rd;

        if (user.isValido()) {
            req.getSession().setAttribute("user", user);
            rd = req.getRequestDispatcher("template.jsp?pg=homeLogado");
            //req.setAttribute("user", user);
        } else {
            req.setAttribute("msg", "Login ou Senha Incorreta");
            rd = req.getRequestDispatcher("template.jsp?pg=login");
        }
        rd.forward(req,resp);
    }

    @Override
    public boolean ehPublico() {
        return false;
    }
}
