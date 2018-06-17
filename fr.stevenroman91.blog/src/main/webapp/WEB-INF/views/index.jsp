<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%--Import de la librairie de tags JSTL core. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma première page JSP</title>
<%--Utilisation de l'API EL qui permet d'evaluer du code JAVA --%>
<%--Utilisation de la syntaxe <%= ... %> pour affecter le résultat de l'expression au contenu HTML généré en sortie. --%>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/index.css" />
</head>
<body>
	<h1 class="titre">Bienvenue sur mon blog</h1>
	<h2>
		<c:url value = "formulaire" var="formulaireUrl" />
		<a href="${formulaireUrl}"> Ajouter un article à mon blog</a>
	</h2>
	<div class="main">
		<c:url value = "/delete?id=" var="deleteUrl"></c:url>
		<%-- Utilisation du tag foreach opur parcourir une collection (==iterable) java. 
		cela permet de dupliquer les éléments HTML à l'intérieur du tag --%>
		<c:forEach var="article" items="${sessionScope.listeArticle}">
			<div class="article">
				<h2>
				${article.title}&nbsp;
				<a href="${deleteUrl}${article.id}">X</a>
				</h2>
				<p>${article.description}</p>
			</div>
		</c:forEach>
	</div>
</body>
</html>