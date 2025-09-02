<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.example.demo10.User" %>
<%
    User user = (User) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thanks</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css">
</head>

<body>
<div class="box">
    <h2>Thank you for completing the survey!</h2>
    <p><b>First Name:</b> <%= user.getFirstName() %></p>
    <p><b>Last Name:</b> <%= user.getLastName() %></p>
    <p><b>Email:</b> <%= user.getEmail() %></p>
    <p><b>Date of Birth:</b> <%= user.getDob() %></p>
    <p><b>Heard about us via:</b> <%= user.getHear() %></p>
    <p><b>Announcements:</b> <%= user.getAnnouncementsAsString() %></p>
    <p><b>Preferred contact:</b> <%= user.getContact() %></p>

    <a href="<%=request.getContextPath()%>/survey">Return to Survey</a>
</div>
</body>
</html>
