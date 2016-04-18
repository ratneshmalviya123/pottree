<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
	<title>Pottree - Product Category</title>
</head>
<body>
<div style="font-family: sans-serif; color: blue;">
	${message}
</div>
<form:form method="post" action="addProductCategory.html">

	<table>
	
	<tr>
		<td><form:label path="productCategory"><spring:message code="label.productCategory"/></form:label></td>
		<td><form:input path="productCategory" /></td> 
	</tr>
	<tr>
		<td><form:label path="parentCategory"><spring:message code="label.parentCategory"/></form:label></td>
		<td><form:select path="parentCategory">
		<form:option value="0" label="Select" />
		<form:options items="${categoryList}" itemLabel="category" itemValue="id"/>
		</form:select></td>
	</tr>
	<tr>
		<td><form:label path="categoryEnabled"><spring:message code="label.categoryEnabled"/></form:label></td>
		<td><form:radiobutton path="categoryEnabled" value="true"/> <spring:message code="label.true"/>
		<form:radiobutton path="categoryEnabled" value="false"/> <spring:message code="label.false"/></td>
	</tr>
	<tr>
		<td><form:label path="description"><spring:message code="label.description"/></form:label></td>
		<td><form:input path="description" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.button.addProductCategory"/>"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
