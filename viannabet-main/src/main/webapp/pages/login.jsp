

<h1>LOGIN</h1>
<form action="/master" method="POST">

<input type="hidden" name="ac" value="verify" />

  Login <input type="text" name="cpLogin">
  Senha <input type="password" name="cpSenha">

  <button>OK</button>
  <br>
<%= (String) request.getAttribute("msg") %>

</form>