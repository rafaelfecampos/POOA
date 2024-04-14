<%@page import="br.edu.vianna.game.model.User" %>
<%
    User u = (User) request.getAttribute("user");
%>

<form action="master?ac=saveUser" method="POST" value="saveUser" >
    <div class="grid">
      <div class="row">
        <label for="">Nome</label>
        <input type="text" name="cpNome" placeholder="nome"
        required
        value="<% u.getNome() %;>"
        />
      </div>
      <div class="row">
          <label for="">Email</label>
          <input type="email" name="cpEmail" placeholder="Email" 
          required
          value="<% u.getEmail() ;%>"

          />
      </div>
      <div class="row">
          <label for="">Login</label>
          <input type="text" name="cpLogin" placeholder="login" 
          required min="8" max="18"
          value="<% u.getLogin() ;%>"

          />
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
        <%= (request.getAttribute("error") != null? request.getAttribute("erro") : "") %>
      </div>
      <div class="row">
          <button>Cadastrar</button>
      </div>
    </div>
  </form>
  