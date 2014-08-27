<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blog</title>
<style> 
body {background: linear-gradient(to right, silver, skyblue);}
</style>

</head>
<body>
<c:if test="${not empty erro}">
	${erro}<br/></c:if>


<h2>Login:</h2>
	<form action="http://localhost:8080/login" method="POST">
		<input type="text" name="email" /> 
		<input type="password" name="senha" /> 
		<input type="submit" value="efetuar login" />
	</form>



<div align="center"><a href="http://localhost:8080/cadastro.jsp">Cadastre-se</a></div>

</body>
</html>