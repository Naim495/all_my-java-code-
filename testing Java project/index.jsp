<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello from Java</title>
</head>
<body style="font-family: Arial; text-align: center; margin-top: 50px;">
    <h1>Welcome to My Java Web Page 🌐</h1>

    <%
        String name = "Naim Emon";
        out.println("<p>Hello, " + name + "! This page is generated using Java.</p>");
    %>
</body>
</html>
