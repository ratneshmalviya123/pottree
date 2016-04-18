<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Spring 3.0 MVC Series: Index - ViralPatel.net</title>
<style type="text/css">
.display
{
height:200;
width:100;
position: absolute;
top:50%;
left: 50%;
margin-top: -100px;
margin-left: -50px;
}
</style>
</head>
<body>
	<%--
	<div align="center">
		<a href="hello.html">Say Hello</a><br /> 
		<a href="contacts.html">Say	Hello</a> <br />
		<a href="productCategory.html">product Hello</a> <br />
		<a href="manageSuppliers.html">Suppliers Hello</a>
	</div>
	 --%>
	 
	 <div  class="display">
	 	<a href="productCategory.html"><spring:message code="link.label.manage.product.category"/></a><br/>
	 	<a href="#"><spring:message code="link.label.manage.bank.details"/></a><br/>
	 	<a href="manageSuppliers.html"><spring:message code="link.label.manage.supplier"/></a><br/>
	 	<a href="#"><spring:message code="link.label.role.management"/></a><br/>
	 </div>
</body>
</html>