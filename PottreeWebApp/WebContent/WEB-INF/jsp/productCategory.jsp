<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring 3 MVC Series - sahej Manager</title>
</head>
<body>



<form:form method="post" action="addProductCategory.html">

	<table>
	<tr>
		<td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastname" /></td>
	</tr>
	<%-- <tr>
		<td><form:label path="lastname"><spring:message code="label.email"/></form:label></td>
		<td><form:input path="email" /></td>
	</tr> --%>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.telephone"/></form:label></td>
		<td><form:input path="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addProductCategory"/>"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
