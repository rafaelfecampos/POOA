package br.edu.vianna.game.controller;

import br.edu.vianna.game.controller.actions.ICommanderAction;
import br.edu.vianna.game.controller.actions.impl.CallViewAction;
import br.edu.vianna.game.controller.actions.impl.HomeAction;
import br.edu.vianna.game.controller.actions.impl.SairAction;
import br.edu.vianna.game.controller.actions.impl.VerificaLoginAction;
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
    }
    private void resposta(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String ac = req.getParameter("ac");
            if(comandos.get(ac) == null){
                req.setAttribute("ac","Error");
                req.setAttribute("msg","Ação nao encontrada!!!");
                new CallViewAction().executar(req, resp);
            }else {
                comandos.get(ac).executar(req, resp);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            RequestDispatcher rd = req.getRequestDispatcher("template.jsp");
//
//            String ac = req.getParameter("ac");
//
//            if (ac == null){
//                Usuario u = (Usuario) req.getSession().getAttribute("user");
//
//                if (u == null) {
//                    rd = req.getRequestDispatcher("template.jsp?pg=home");
//                }else{
//                    rd = req.getRequestDispatcher("template.jsp?pg=homeLogado");
//                }
//
//            }else if (ac.equals("login")){
//                rd = req.getRequestDispatcher("template.jsp?pg=login");
//            }else if (ac.equals("verify")) {
//
//                Usuario user = new Usuario(req.getParameter("cpLogin"),
//                        req.getParameter("cpSenha"));
//
//                if (user.isValido()) {
//                    req.getSession().setAttribute("user", user);
//                    rd = req.getRequestDispatcher("template.jsp?pg=homeLogado");
//                    //req.setAttribute("user", user);
//                } else {
//                    req.setAttribute("msg", "Login ou Senha Incorreta");
//                    rd = req.getRequestDispatcher("template.jsp?pg=login");
//                }
//            }else if (ac.equals("logout")){
//                req.getSession().invalidate();
//                rd = req.getRequestDispatcher("template.jsp?pg=home");
//            }
//
//            rd.forward(req,resp);
//
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

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
