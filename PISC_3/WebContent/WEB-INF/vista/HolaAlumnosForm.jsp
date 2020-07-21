<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola Alumno</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">

</head>
<body>
	<form action="procesarFormulario2" method="get">
		<input type="text" name="nombreAlumno">
		<input type="submit">
	</form>
</body>
</html>