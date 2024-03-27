package br.edu.vianna.game.controller;

import br.edu.vianna.game.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }

    private void resposta(HttpServletRequest req, HttpServletResponse resp) {

        String ac = req.getParameter("ac");
        RequestDispatcher rd;
        if (ac == null){
            rd = req.getRequestDispatcher("home.jsp");
        }else if (ac.equals("login")){
            rd = req.getRequestDispatcher("login.jsp");
        }else if (ac.equals("equipe")){
            rd = req.getRequestDispatcher("equipe.jsp");
        }else if (ac.equals("ajuda")){
            rd = req.getRequestDispatcher("ajuda.jsp");
        }else if (ac.equals("verify")){

            Usuario user = new Usuario(req.getParameter("cpLogin"),
                    req.getParameter("cpSenha"));

            if (user.isValido()){
                req.getSession().setAttribute("user", user);
                rd = req.getRequestDispatcher("homeLogado.jsp");
                //req.setAttribute("user", user);
            }else{
                req.setAttribute("msg", "Login ou Senha Incorreta");
                rd = req.getRequestDispatcher("login.jsp");
            }
        }else{
            rd = req.getRequestDispatcher("erro.jsp");
        }

        try {
            rd.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }
}
