<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<spring:theme code="css"/>" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<style>
	body {
		font-family: sans-serif, Arial;
	}
</style>
<script type="text/javascript">
window.history.forward(0);
</script>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0" align="center">
	<tr height="1%">
		<td colspan="2" align="right">
				<tiles:insertAttribute name="utilsHeader" />
		</td>
	</tr>
	<tr>
		<td height="30" colspan="2"><tiles:insertAttribute name="header" />
		</td>
	</tr>

	<tr>
		<td height="350" valign="top"><tiles:insertAttribute name="menu" /></td>
		<td width="350" valign="top"><tiles:insertAttribute name="body" /></td>
	</tr>
	<tr>
		<td height="30" width="600" colspan="2"><tiles:insertAttribute name="footer" />
		</td>
	</tr>
</table>
</body>
</html>
