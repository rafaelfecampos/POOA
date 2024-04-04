<!doctype html>
<%@ page import="br.edu.vianna.game.model.Usuario" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ApostaBet</title>
    <link rel="stylesheet" href="./css/home.css">
</head>
<body>
<div class="header">
    <h1>Jogos</h1>
</div>
<div class="container">
    <div class="menu">
        <table border=0>
            <tr>
                <td>
                    <a href="/home">Inicio</a>
                </td>
                <td>
                    <a href="/home?ac=login">login</a>
                </td>
                <td>
                    <a href="/home?ac=jogos">Jogos</a></td>
                <td>
                    <a href="/home?ac=cassino">Cassino</a>
                </td>
                <td>
                    <a href="/home?ac=promocoes">Promocoes</a>
                </td>
                <td>
                    <a href="/home?ac=ajuda">Ajuda</a>
                </td>
            </tr>
        </table>
        <div class="conteudo">
            <%
                Usuario u = (Usuario)session.getAttribute("user");
            %>
            <h1>Em que posso lhe ajudar, <%= u.getNome()%>?</h1>
        </div>
    </div>
</div>
<div class="footer">footer</div>

</body>
</html>