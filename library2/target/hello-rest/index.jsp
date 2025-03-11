<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDate" %>
<html>
<head>
    <title>Benvenuto</title>
</head>
<body>
    <h1>Benvenuto Utente Curioso,</h1>
    <p>questa è la mia prima JSP.</p>
    <p>Oggi è il giorno <%= LocalDate.now() %></p>
    <p>Autore: <a href="author.jsp">link</a></p>
</body>