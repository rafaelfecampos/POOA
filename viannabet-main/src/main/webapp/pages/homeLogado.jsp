
<%@page import="br.edu.vianna.game.model.User" %>

<% Usuario u = (Usuario)session.getAttribute("user");  %>

<h1>Bem vindo <%= u.getNome() %></h1>