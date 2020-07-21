<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hola ${param.nombreAlumno}. Bienvenido al curso
<br>
<br>
Nombre en mayuscula: ${nombreMayus}
<br>
<br>

<img alt="foto" src="${pageContext.request.contextPath}/resources/imgs/vasa.jpg">

</body>
</html>