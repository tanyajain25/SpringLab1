<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
table, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<form method="get" action="modifyprocess">
		<h2>Enter Trainee Details for Modifications</h2>
		<table>
			<tr>
				<td>Trainee Id</td>
				<td><input type="number" name="traineeId"></td>
			</tr>

			<tr>
				<td>Trainee Name</td>
				<td><input type="text" name="traineeName"></td>
			</tr>

			<tr>
				<td>Trainee Location</td>
				<td><input type="radio" name="traineeLocation" value="Chennai">Chennai</td>
				<td><input type="radio" name="traineeLocation" value="Banglore">Banglore</td>
				<td><input type="radio" name="traineeLocation" value="Mumbai">Mumbai</td>
				<td><input type="radio" name="traineeLocation" value="Pune">Pune</td>
			</tr>

			<tr>
				<td>Trainee Domain</td>
				<td><select name="traineeDomain">
					<option value="JEE">JEE</option>
					<option value=".Net">.Net</option>
					<option value="Mainframe">Mainframe</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>
