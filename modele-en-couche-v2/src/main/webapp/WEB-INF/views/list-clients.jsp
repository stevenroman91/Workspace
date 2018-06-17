<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- link css -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<!-- link js -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>
</head>

<body>
	<div class="container">
		<h2>Clients</h2>
		<!--Search Form -->
		<form action="/client" method="get" id="seachClientForm"
			role="form">
			<input type="hidden" id="searchAction" name="searchAction"
				value="searchById">
			<div class="form-group col-xs-5">
				<input type="number" name="clientName" id="clientName"
					class="form-control" required="true"
					placeholder="Type the id of the employee" />
			</div>
			<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-search"></span> Search
			</button>
			<br></br> <br></br>
		</form>

		<!--Employees List-->
		<form action="/client" method="post" id="clientForm" role="form">

			<c:choose>
				<c:when test="${not empty clientList}">
					<table class="table table-striped">
						<thead>
							<tr>
								<td>#</td>
								<td>Name</td>
							</tr>
						</thead>
						<c:forEach var="client" items="${clientList}">
							<c:set var="classSucess" value="" />
							<c:if test="${id == client.id}">
								<c:set var="classSucess" value="info" />
							</c:if>
							<tr class="${classSucess}">
								<td>${client.id}</td>
								<td>${client.nom}</td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:otherwise>
					<br>
					<div class="alert alert-info">No people found matching your
						search criteria</div>
				</c:otherwise>
			</c:choose>
		</form>

	</div>
</body>
</html>