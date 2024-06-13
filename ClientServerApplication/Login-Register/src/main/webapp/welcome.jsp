<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
    <%
        // Retrieve the session object
        HttpSession session1 = request.getSession(false);

        if (session1 != null && session1.getAttribute("username") != null) {
            String username = (String) session1.getAttribute("username");
    %>

      <div class="container">
        <h1>Welcome, <%= username %>!</h1>
       
        <a href="logout.jsp">LOGOUT</a> 
    </div>

    <%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>

</body>
</html>