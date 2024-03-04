package br.edu.vianna.servlet;

import br.edu.vianna.model.Calculadora;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("quarto")
public class QuartoServet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }

    private void resposta(HttpServletRequest req, HttpServletResponse resp) {

        try {
            String v1 = req.getParameter("cpValor1");
            String v2 = req.getParameter("cpValor2");
            String btn = req.getParameter("btn");

            Calculadora c = new Calculadora();
            c.setValor1(Integer.parseInt(v1));
            c.setValor2(Integer.parseInt(v2));
            c.setOperador(btn);

            RequestDispatcher dr= req.getRequestDispatcher("respostaForward.jsp");
            dr.forward(req,resp);
        } catch (ServletException e) {
            System.out.println("deu ruim");
        } catch (IOException e) {
            System.out.println("deu ruim");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resposta(req, resp);
    }
}
