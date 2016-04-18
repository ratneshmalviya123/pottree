<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Product Category</title>
</head>
<body>

<h2 align="center">Manage Product Category</h2>

<div align="center">
	<table>
		<tr>
			<td>Product Category Code
			</td>
			<td><input type="text">
			</td>
		</tr>
		<tr>
			<td>Product Category
			</td>
			<td><input type="text">
			</td>
		</tr>
		<tr>
			<td>Parent Category
			</td>
			<td><select>
					<option>Crockery</option>
					<option>Pots</option>
					<option>Vases</option>
					<option>HomeDecor</option>
					<option>Art Pieces</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Category Enabled
			</td>
			<td><select>
					<option>Crockery</option>
					<option>Pots</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>
			</td>
			<td><input type="submit" value="Search">
			</td>
		</tr>
	</table>
	
	<a href="index.jsp">back to admin home page</a>
</div>

</body>
</html>