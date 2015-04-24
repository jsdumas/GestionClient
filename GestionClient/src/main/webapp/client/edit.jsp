<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="edit.do" method="POST" commandName="client">
		<form:hidden path="id"/>
		<form:errors path="*"/>
<%-- 	<label>Id : </label><form:input path="id"/> --%>
	<label><fmt:message key="Client.nom"/> : </label><form:input path="nom"/>
	<label><fmt:message key="Client.totalFacture"/> : </label><form:input path="totalFacture"/>
	<label><fmt:message key="Client.dateContrat"/> :</label><form:input path="dateContrat"/>
	<input type="submit"/>
</form:form>


</body>
</html>