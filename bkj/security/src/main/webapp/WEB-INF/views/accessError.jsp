<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	/accessError 
</h1>
<h2><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage() }"></c:out></h2>
<h2><c:out value="${msg}"></c:out></h2>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
