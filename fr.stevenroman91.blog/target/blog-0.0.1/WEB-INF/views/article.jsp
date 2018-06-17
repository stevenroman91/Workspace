<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%--Import de la librairie de tags JSTL core. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajout d'articles au blog</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/article.css" />
</head>
<body>
	<div>
		<h1 class="title">Bonjour, ajoutez vos articles au blog.</h1>
		<form method="post">
			<div>
				<label for="titre">titre de l'article:</label><br>
				 <input id="titre" name="titre" required=""><br>
			</div>
			<div>
				<label for="message">contenu de l'article:</label><br>
				<textarea name="message" rows="10" cols="30">
					Tapez votre article.
				</textarea>
			</div>
			<button>soumettre</button>
		</form>
	</div>
</body>
</html>