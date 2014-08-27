<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Usuarios</title>
</head>
<body>

	<h1>Lista de usuarios</h1>

	<c:if test="${not empty usuarios}">
		<table border=1 cellspacing=0 cellpadding=2 bordercolor="000">
			<tr>
				<td>
					<ul>
						<c:forEach var="usuario" items="${usuarios}">
							<br />
							<li>Nome: ${usuario.name}, Email: ${usuario.email} <br />


							</li>

						</c:forEach>
					</ul>
				</td>
			</tr>
		</table>
	</c:if>
</body>
</html>