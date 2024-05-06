
<%@page import="br.edu.vianna.game.model.Jogo" %>
<%@page import="java.util.List" %>

<%
    List<Jogo> jogos = (List<Jogo>)request.getAttribute("jogos");
%>

<h1>Vamos Apostar?</h1>

<div class="tableJogos">

<table>
<thead>
    <tr>
        <td>Data</td>
        <td>Time Mandante</td>
        <td>Odds</td>
        <td>Placar</td>
        <td>X</td>
        <td>Placar</td>
        <td>Odds</td>
        <td>Time Visitante</td>
    </tr>
</thead>
<%
    if (jogos.size() == 0){%>
        <tr>
            <td colspan="8"> Não há Jogos Disponíveis</td>
        </tr>
<%    }else{
        for (Jogo j : jogos){
%>
        <tr>
            <td><%= j.getDataJogo() %></td>
            <td><%= j.getTime1().getNome() %></td>
            <td><%= j.getOddsTime1() %></td>
            <td><%= j.getGolsTime1() %></td>
            <td>X</td>
            <td><%= j.getGolsTime2() %></td>
            <td><%= j.getOddsTime2() %></td>
            <td><%= j.getTime2().getNome() %></td>
        </tr>

<%      }
    }
%>
<!--
<tr>
    <td>17/04/2024 21:30</td>
    <td>Flamengo</td>
    <td>0.3</td>
    <td>0</td>
    <td>X</td>
    <td>5</td>
    <td>0.01</td>
    <td>São Paulo</td>
</tr>
<tr>
    <td>17/04/2024 21:30</td>
    <td>Vasco</td>
    <td>5</td>
    <td>0</td>
    <td>X</td>
    <td>1</td>
    <td>0.9</td>
    <td>Bragantino</td>
</tr>
-->
</table>

</div>