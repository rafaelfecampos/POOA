package br.edu.vianna.game.controller.actions.impl;

import br.edu.vianna.game.model.ETipoUsuario;
import br.edu.vianna.game.model.User;
import br.edu.vianna.game.model.dao.impl.UserDAO;
import br.edu.vianna.game.util.UtilService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class CallSaveUserAction implements br.edu.vianna.game.controller.actions.ICommanderAction {


    @Override
    public boolean ehPublico() {
        return true;
    }

    @Override
    public void executar(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
            User u = new User();
            u.setNome( req.getParameter("cpNome") );
            u.setEmail( req.getParameter("cpEmail") );
            u.setLogin( req.getParameter("cpLogin") );
            u.setSenha(UtilService.md5(req.getParameter("cpSenha"))  );
            u.setTipo(ETipoUsuario.APOSTADOR);
            u.depositar( 1000 );

            if (u.getNome() == null || u.getNome().isEmpty() ||
            u.getNome().isBlank()){
                req.setAttribute("ac", "cadUser");
                req.setAttribute("error", "nome está em branco");
                req.setAttribute("user", u);
                 new CallViewAction().executar(req, resp);
            }
        if (u.getSenha() == null || u.getSenha().isEmpty() ||
                u.getSenha().isBlank() ||
        ! u.getSenha().equals( UtilService.md5(req.getParameter("cpNewSenha"))  )){
            req.setAttribute("ac", "cadUser");
            req.setAttribute("error", "senha não confere");
            req.setAttribute("user", u);
            new CallViewAction().executar(req, resp);
        }

        new UserDAO().inserir(u);

        req.setAttribute("ac", "login");
        new CallViewAction().executar(req, resp);


    }
}
