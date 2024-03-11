<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ApostaBet - Login</title>
    <link rel="stylesheet" href="./css/login.css">
</head>
<body>
    <div class="header">
        <h1>ApostaBet</h1>
    </div>
    <div class="container">
        <fieldset>
            <legend>Login</legend>
            <form action="/home" method="post">
                <input type="hidden" value="verify" name="ac">
                <input type="text" placeholder="Email" size="30" name="cpLogin"><br>
                <input type="password" placeholder="Senha" size="30" name="cpSenha"><br>
                <input type="submit" value="Entrar">
            </form>
        </fieldset>
    </div>
    <div class="footer">footer</div>
</body>
</html>