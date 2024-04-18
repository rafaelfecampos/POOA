package br.edu.vianna.game.controller.actions;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public interface ICommanderAction {

    public boolean ehPublico();

    public void executar(HttpServletRequest req, HttpServletResponse resp)
            throws Exception;

}
