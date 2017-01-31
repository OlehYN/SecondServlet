<%@ page import="com.javaee.servlet.dto.Prediction" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Прогнозування матчів</title>
</head>
<body>
<div style="text-align:center">
<%
	Prediction prediction = (Prediction) request.getAttribute("prediction");

	out.println(prediction.getHomeTeam() + " " + prediction.getHomeGoals() + ":");
	out.println(prediction.getGuestGoals() + " " + prediction.getGuestTeam());
	out.println("<br/>");
	out.println(prediction.getDescription());
%>

<br/>
<br/>
<br/>
<a href="/SecondServlet">Назад</a>
</div>
</body>
</html>