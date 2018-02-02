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

    <title>Virement — Tableau de bord — ProxiBanque</title>

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
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
          <ul class="navbar-nav mr-auto">            
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
              <a class="nav-link" href="ClientsServlet">Aperçu</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="MajClient">Modifier un client</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="VirementServlet">Effectuer un virement <span class="sr-only">(current)</span></a>
            </li>
          </ul>

          <ul class="nav nav-pills flex-column">
            <li class="nav-item">
              <a class="nav-link" href="DeconnexionServlet">Déconnexion</a>
            </li>
          </ul>
        </nav>

        <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
          <h1>Tableau de bord</h1>
          <h2>Virement compte à compte</h2>

          <h3>Virement depuis un compte vers n’importe quel compte de la banque</h3>
          <form method="post" action="MajVirement">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Choix du compte client à débiter</label>
                  <select class="form-control" id="exampleFormControlSelect1" name="compteADebiter">
                    <c:forEach var="client" items="${requestScope.clients}" >
                      <c:forEach var="compte" items="${client.comptes}">
                        <option value="${compte.identifiant}">${client.identifiant} — ${client.prenom} ${client.nom} — ${client.adresse} — ${client.courriel} — ${compte.identifiant}</option>
                      </c:forEach>
                    </c:forEach>
                  </select>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Choix du compte client à créditer</label>
                  <select class="form-control" id="exampleFormControlSelect1" name="compteACrediter">
                    <c:forEach var="client" items="${requestScope.clients}" >
                      <c:forEach var="compte" items="${client.comptes}">
                        <option value="${compte.identifiant}">${client.identifiant} — ${client.prenom} ${client.nom} — ${client.adresse} — ${client.courriel} — ${compte.identifiant}</option>
                      </c:forEach>
                    </c:forEach>
                  </select>
                </div>
              </div>
            </div>
            <div class="form-row">
              <div class="col-md-10">
                <label for="validationCustom03">Montant</label>
                <input type="text" class="form-control" id="validationCustom03" name="montant" placeholder="Montant" required>
              </div>
            </div>
            <button class="btn btn-primary" type="submit">Effectuer le virement</button>
          </form>
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
