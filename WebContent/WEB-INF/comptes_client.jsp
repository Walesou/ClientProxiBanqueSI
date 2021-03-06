<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/favicon.ico">

    <title>Tableau de bord — ProxiBanque</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
  </head>

  <body>
    <header>
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">Tableau de bord</a>
        <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"> </span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href=${pageContext.request.contextPath}/gestion/index.jsp">Accueil <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/support.jsp">Support</a>
            </li>
          </ul>
        </div>
      </nav>
    </header>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-sm-3 col-md-2 d-none d-sm-block bg-light sidebar">
          <ul class="nav nav-pills flex-column">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">Aperçu</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="modifier_client.jsp">Modifier un client</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="effectuer_virement.jsp">Effectuer un virement</a>
            </li>
          </ul>

          <ul class="nav nav-pills flex-column">
            <li class="nav-item">
              <a class="nav-link" href="deconnexion.jsp">Déconnexion</a>
            </li>
          </ul>
        </nav>

        <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
          <h1>Tableau de bord</h1>

          <section class="row text-center placeholders">
            <div class="col-12 col-md-12 placeholder">
              <div class="container">
                <img src="data:image/gif;base64,R0lGODlhAQABAIABAADcgwAAACwAAAAAAQABAAACAkQBADs=" width="200" height="200" class="img-fluid rounded-circle" alt="Generic placeholder thumbnail">
                <c:set var="total" value="${0}"/>
                <c:forEach var="compte" items="${listComptes}">
                  <c:set var="total" value="${total + compte.solde}" />
                </c:forEach>
                <chiffre>${total} €</chiffre>
              </div>
              <h4>Solde total</h4>
              <span class="text-muted">Le solde total du client</span>
            </div>
          </section>

          <h2>Solde du client #${param.idClient}</h2>
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead class="thead-dark">
                <tr>
                  <th>#Compte</th>
                  <th>Solde</th>
                  <th>Type</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="compte" items="${requestScope.listComptes}">
                  <tr>
                    <td>${compte.identifiant}</td>
                    <td>${compte.solde} €</td>
                    <c:if test="${compte.getClass().name == 'com.huios.domaine.CompteCourant'}">
                      <td>Courant</td>
                    </c:if>
                    <c:if test="${compte.getClass().name != 'com.huios.domaine.CompteCourant'}">
                      <td>Épargne</td>
                    </c:if>
                  </tr>
                </c:forEach>

              </tbody>
            </table>
          </div>
        </main>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="${pageContext.request.contextPath}/js/vendor/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/divers.js"></script>
  </body>
</html>
