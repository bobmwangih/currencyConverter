<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<form method ="POST" action ="index">
		<table>
			<tr>
				<td>The conversion rate is : </td>
				<td><h3>${cRate}</h3></td>
			</tr>
			<tr>
				<td>The Result: </td>
				<td><h3>${answer}</h3></td>
				<td>${curTo}</td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" value ="Go back"/></td>

			</tr>
		</table>
	</form>
</body>
</html>