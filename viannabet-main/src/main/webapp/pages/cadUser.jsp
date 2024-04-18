
<%@page import="br.edu.vianna.game.model.User" %>

<%
    User u = (User)request.getAttribute("user");
%>

<form action="master" method="POST">

 <input type="hidden" name="ac" value="saveUser" />

  <div class="grid">
    <div class="row">
      <label for="">Nome</label>
      <input type="text" name="cpNome" placeholder="nome"
      value="<%= u.getNome() %>"
      required
      />
    </div>
    <div class="row">
        <label for="">Email</label>
        <input type="email" name="cpEmail" placeholder="Email"
        value="<%= u.getEmail() %>"
        required
        />
    </div>
    <div class="row">
        <label for="">Login</label>
        <input type="text" name="cpLogin" placeholder="login"
        value="<%= u.getLogin() %>"
        required min="8" max="18"/>
    </div>
    <div class="row">
        <label for="">Senha</label>
        <input type="password" name="cpSenha" placeholder="senha"
        required />
    </div>
    <div class="row">
        <label for="">Repita a Senha</label>
        <input type="password" name="cpNewSenha" placeholder="senha"
        required />
    </div>
    <div class="row">
    <%= (request.getAttribute("error") != null? request.getAttribute("error") : "") %>
    </div>
    <div class="row">
        <button>Cadastrar</button>
    </div>
  </div>
</form>
