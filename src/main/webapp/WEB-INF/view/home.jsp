<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8" />
<title>Spring MVC 4 REST + AngularJS</title>
</head>
<body ng-app="myApp">
	<div ng-controller="PersonController as personCtrl">
		<h1>Spring MVC 4 REST + AngularJS</h1>
		<form name="personForm" method="POST">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"
						ng-model="personCtrl.person.name"  /> </td>
				</tr>
				<tr>
					<td>id:</td>
					<td><input type="text" name="id"
						ng-model="personCtrl.person.id"  /> </td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><input type="text" name="location"
						ng-model="personCtrl.person.location"  /> </td>
				</tr>
				
				<tr>
					<td colspan="2">
						<div>
							<input type="submit" ng-click="personCtrl.addPerson()"
								value="Add Person" /> <input type="button"
								ng-click="personCtrl.reset()" value="Reset" />
						</div>
					</td>
				</tr>

			</table>
		</form>

	</div>
	<script
		type="text/javascript" src="resources/js/lib/angular.min.js"></script>
	<script
	type="text/javascript"	src="resources/js/lib/angular-resource.min.js"></script>
	<script
	type="text/javascript"	src=resources/js/app.js"></script>
	<link rel="stylesheet" type="text/css"
		href="resources/css/style.css" />
</body>
</html>
