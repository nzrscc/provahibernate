<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 22/05/2019
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/registrazione" method="post">
    <label for="username">Username</label>
    <input id="username" type="text" name="username" required="true">
    <label for="nome">Nome</label>
    <input id="nome" type="text" name="nome" required="true">
    <br><br>
    <button type="submit" id="registrati" name="registrati" value="registrati">Registrati</button>
</form>
</body>
</html>
