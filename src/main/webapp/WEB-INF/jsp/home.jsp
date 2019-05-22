<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Home</title>
    <h1>Benvenuto su Master Mind!</h1>
</head>
<body>
<form action="/logIn" method="post">
    <br>
    <label for="username">Username</label>
    <input id="username" type="text" name="username" required="true">
    <br><br>
    <button type="submit" id="accedi" name="accedi" value="accedi">Accedi</button>
</form>
<br><br><br>
<form action="/registrati" method="post">
<%--    <label for="nome">Nome</label>--%>
<%--    <input id="nome" type="text" name="nome" required="true">--%>
<%--    <br><br>--%>
    <button type="submit" id= "registrati" name="registrati" value="registrati">Registrati</button>
</form>
</body>
</html>