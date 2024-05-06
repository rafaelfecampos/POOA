<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="br.edu.vianna.game.model.User" %>

<h1>Bem vindo ${ sessionScope.user.nome }</h1>
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
        <td>Apostar</td>
    </tr>
</thead>
<tbody>
    <c:if test="${requestScope.jogos.size() == 0}">
        <tr>
            <td colspan="9"> Não há Jogos Disponíveis</td>
        </tr>
    </c:if>
    <c:if test="${requestScope.jogos.size() > 0}">

        <c:forEach items="${requestScope.jogos}" var="j">
            <tr>
                <td> <fmt:formatDate pattern="dd/MM/yyyy HH:mm"
                        value="${ j.dataJogo}" /> </td>
                <td> ${ j.time1.nome} </td>
                <td> ${ j.oddsTime1} </td>
                <td> ${ j.golsTime1} </td>
                <td>X</td>
                <td> ${ j.golsTime2} </td>
                <td> ${ j.oddsTime2} </td>
                <td> ${ j.time2.nome} </td>
                <td>
                    <c:if test="${sessionScope.user.isAdmin()}">
                        <a href="#">
                        <img src="../images/lock.png" caption="Finalizar o jogo" />
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.user.isApostador()}">
                        <a href="#">
                        <img src="../images/coinDolar.png" />
                        </a>
                    </c:if>
                 </td>
            </tr>
        </c:forEach>

    </c:if>
</tbody>
</table>

</div>

<div class="card hide">
    <h1>TESTANDO CARD</h1>
</div>

