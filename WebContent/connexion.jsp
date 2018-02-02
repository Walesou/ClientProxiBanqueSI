<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta lang="fr" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/favicon.ico">

    <title>Connexion — ProxiBanque</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
  </head>

  <body>
    <div class="container">
      <header class="header clearfix">
        <nav>
          <ul class="nav nav-pills float-right">
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Accueil</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/support.jsp">Support</a>
            </li>
          </ul>
        </nav>
        <h3 class="text-muted">Proxi<img src="${pageContext.request.contextPath}/favicon.ico" alt="B"/>anque</h3>
        <h5 class="text-muted">Une banque qu’elle est proche de vous</h5>
      </header>

      <form method="post" class="form-signin" action="AuthentificationServlet">
        <h2 class="form-signin-heading">Connexion</h2>
        <label for="inputEmail" class="sr-only">Courriel</label>
        <input type="email" name="j_username" id="inputEmail" class="form-control" placeholder="Courriel" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" name="j_password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Se connecter</button>
      </form>

    </div> <!-- /container -->
  </body>
</html>
