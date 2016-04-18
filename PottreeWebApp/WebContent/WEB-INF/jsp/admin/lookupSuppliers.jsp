<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pottree - Suppliers Category</title>
</head>
<body>
	<form:form action="getSuppliers.html" method="post">
		<table>
			<tr>
				<td><form:label path="supplierId"></form:label> <spring:message code="label.supplier.id"/> </td>
				<td><form:input path="supplierId"/></td>
			</tr>
			<tr>
				<td><form:label path="name"/> <spring:message code="label.supplier.name"/> </td>
				<td><form:input path="name"/> </td>
			</tr>
			<tr>
				<td><form:label path="tinNumber"/> <spring:message code="label.supplier.tin.number"/> </td>
				<td><form:input path="tinNumber"/> </td>
			</tr>
			<tr>
				<td><form:label path="registrationNumber"/> <spring:message code="label.supplier.registration.number"/> </td>
				<td><form:input path="registrationNumber"/> </td>
			</tr>
			<tr>
				<td><form:label path="supplierEnabled"></form:label> <spring:message code="label.supplier.supplier.enabled"/> </td>
				<td>
					<form:radiobutton path="supplierEnabled" value="true"/> <spring:message code="label.true"/>
					<form:radiobutton path="supplierEnabled" value="false"/> <spring:message code="label.false"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="city"/> <spring:message code="label.supplier.city"/> </td>
				<td><form:input path="city"/> </td>
			</tr>
			<tr>
				<td><form:label path="state"/> <spring:message code="label.supplier.state"/> </td>
				<td>
					<form:select path="state">
						<form:option value="0" label="Select" />
						<form:options items="${cityList}" itemLabel="state" itemValue="id"/>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="<spring:message code="label.button.lookUp"/>"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>