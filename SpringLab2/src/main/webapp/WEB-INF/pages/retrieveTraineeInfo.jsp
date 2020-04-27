<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>

	<form method="get">
		<table>
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Trainee Domain</th>
				<th>Trainee Location</th>
			</tr>

			<tr>
				<td><c:out value="${trainee.traineeId}" /></td>

				<td><c:out value="${trainee.traineeName}" /></td>

				<td><c:out value="${trainee.traineeDomain}" /></td>

				<td><c:out value="${trainee.traineeLocation}" /></td>
			</tr>

		</table>
	</form>
	<a href="operations">Back</a>
</body>
</html>

