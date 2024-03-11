package br.edu.vianna.game.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        respota(req, resp);
    }

    private void respota(HttpServletRequest req, HttpServletResponse resp) {
        String ac = req.getParameter("ac");
        RequestDispatcher rd = req.getRequestDispatcher("home.jsp");

        if(ac!=null && ac.equals(("log"))){
            rd = req.getRequestDispatcher("login.jsp");
        }else if(ac.equals("verify")){
            String login = req.getParameter("cpLogin");
            String senha = req.getParameter("cpSenha");
            if(login.equals("admin") && senha.equals("123")){
                rd = req.getRequestDispatcher("homeLogado.jsp");
            }
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
        respota(req, resp);

    }
}
