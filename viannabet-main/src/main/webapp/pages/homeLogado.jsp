
<%@page import="br.edu.vianna.game.model.User" %>

<% User u = (User)session.getAttribute("user");  %>

<h1>Bem vindo <%= u.getNome() %></h1>