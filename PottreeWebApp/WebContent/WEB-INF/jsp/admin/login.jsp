<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.login" /></title>
</head>
<body>
	<form:form action="login.html">
		<div style="font-family: sans-serif; font-weight: bold; color: red;">
			${loginError}</div>
		<table>
			<tr>
				<td><form:label path="userName">
						<spring:message code="label.username" />
					</form:label></td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td><form:label path="password">
						<spring:message code="label.password" />
					</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"
					value="<spring:message code="label.login" />"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>