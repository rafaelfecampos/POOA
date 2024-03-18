package br.edu.vianna.game.controller;

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
        respota(req, resp);
    }

    private void respota(HttpServletRequest req, HttpServletResponse resp) {
        String ac = req.getParameter("ac");
        RequestDispatcher rd;

        if( ac == null){
            rd=req.getRequestDispatcher("home.jsp");
        } else if (ac.equals("login")) {
            rd = req.getRequestDispatcher("login.jsp");
        } else if (ac.equals("jogos")) {
            rd = req.getRequestDispatcher("jogos.jsp");
        } else if (ac.equals("cassino")){
            rd = req.getRequestDispatcher("home.jsp");
        }else if (ac.equals("promocoes")){
            rd = req.getRequestDispatcher("home.jsp");
        }else if (ac.equals("ajuda")){
            rd = req.getRequestDispatcher("home.jsp");
        }else if (ac.equals("verify")){
            String login = req.getParameter("cpLogin");
            String senha = req.getParameter("cpSenha");

            if (login.equals("admin") && senha.equals("123")){
                rd = req.getRequestDispatcher("homeLogado.jsp");
            }else{
                req.setAttribute("msg", "Login ou senha incorreto!");
                rd = req.getRequestDispatcher("login.jsp");
            }
        } else {
            rd = req.getRequestDispatcher("erro.jsp");
        }

        try{
            rd.forward(req,resp);
        }catch (ServletException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        respota(req, resp);

    }
}
