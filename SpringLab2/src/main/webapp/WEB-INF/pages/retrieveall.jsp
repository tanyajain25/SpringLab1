<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.capg.assign.entity.Trainee"%>
<%@ page import="java.util.List" isELIgnored="false" %>
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

	<form>
	<h2>All Trainees Information</h2>
		<table>
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Trainee Domain</th>
				<th>Trainee Location</th>
			</tr>
			
			
			<c:forEach items="${traineelist}" var="trainee" >
			<tr>
				<td>${trainee.traineeId}</td>

				<td>${trainee.traineeName}</td>

				<td>${trainee.traineeDomain}</td>

				<td>${trainee.traineeLocation}</td>
			</tr>
				</c:forEach>
			

		</table>
	</form>
	<a href="operations">Back</a>
</body>
</html>

