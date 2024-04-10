package br.edu.vianna.game.controller;

import br.edu.vianna.game.controller.actions.ICommanderAction;
import br.edu.vianna.game.controller.actions.impl.*;
import br.edu.vianna.game.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/master")
public class MasterController extends HttpServlet {

    static HashMap<String, ICommanderAction> comandos = new HashMap();

    static {
        comandos.put(null, new HomeAction());
        comandos.put("master", new HomeAction());
        comandos.put("login", new CallViewAction());
        comandos.put("ajuda", new CallViewAction());
        comandos.put("verify", new VerificaLoginAction());
        comandos.put("logout", new SairAction());
        comandos.put("testaBanco", new TestaBancoAction());
        comandos.put("cadUser", new CallUserView());
        comandos.put("saveUser", new CallSaveUserAction());
    }

    private void resposta(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String ac = req.getParameter("ac");
            if (comandos.get(ac) == null){
                req.setAttribute("ac","Error");
                req.setAttribute("msg","Ação não encontrada!!!!");
                new CallViewAction().executar(req,resp);
            }else {
                comandos.get(ac).executar(req, resp);
            }

        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }
}
