<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css">
</head>

<body>
<img src="<%=request.getContextPath()%>/images/anhlogo.png" alt="Murach Logo" class="logo">

<h1 style="text-align:center;">Survey</h1>
<p style="text-align:center;">If you have a moment, we’d appreciate it if you would fill out this survey.</p>

<div class="error"><%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %></div>

<form action="<%=request.getContextPath()%>/survey" method="post">
    <h3>Your information</h3>
    <label>First Name:</label>
    <input type="text" name="firstName" required>

    <label>Last Name:</label>
    <input type="text" name="lastName" required>

    <label>Email:</label>
    <input type="email" name="email" required>

    <label>Date of Birth:</label>
    <input type="date" name="dob" required>

    <h3>Other information</h3>
    <label>How did you hear about us?</label>
    <div><input type="radio" name="hear" value="search" checked> Search engine</div>
    <div><input type="radio" name="hear" value="word"> Word of mouth</div>
    <div><input type="radio" name="hear" value="social"> Social Media</div>
    <div><input type="radio" name="hear" value="other"> Other</div>

    <label>Would you like to receive announcements about new CDs and special offers?</label>
    <div><input type="checkbox" name="announcements" value="yes"> YES, I'd like that.</div>
    <div><input type="checkbox" name="announcements" value="email"> YES, please send me email announcements</div>

    <label>Preferred contact method:</label>
    <select name="contact">
        <option value="both">Email or postal mail</option>
        <option value="email">Email only</option>
        <option value="postal">Postal mail only</option>
    </select>

    <input type="submit" value="Submit">
</form>
</body>
</html>
