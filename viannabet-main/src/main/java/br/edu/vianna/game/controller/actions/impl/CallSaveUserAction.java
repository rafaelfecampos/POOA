package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CallSaveUserAction implements br.edu.vianna.game.controller.actions.ICommanderAction {
    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u = new User();
        u.setNome( req.getParameter("cpNome"));
        u.setEmail( req.getParameter("cpEmail"));
        u.setLogin( req.getParameter("cpLogin"));
        u.setSenha( req.getParameter("cpSenha"));

        if(u.getNome() == null || u.getNome().isEmpty() || u.getNome().isBlank()){
            req.setAttribute("msg","cadUser");
            req.setAttribute("error", "Nome está em branco");
            new CallViewAction().executar(req, resp);
        }
    }
}
