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
        <a class="navbar-brand" href="${pageContext.request.contextPath}/gestion/index.jsp">Tableau de bord</a>
        <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/gestion/index.jsp">Accueil</a>
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
              <a class="nav-link" href="mes_clients.jsp">Aperçu</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="modifier_client.jsp">Modifier un client</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="effectuer_virement.jsp">Effectuer un virement <span class="sr-only">(current)</span></a>
            </li>
          </ul>

          <ul class="nav nav-pills flex-column">
            <li class="nav-item">
              <a class="nav-link" href="deconnexion.jsp">Déconnexion</a>
            </li>
          </ul>
        </nav>

        <main role="main" class="col-sm-9 ml-sm-auto col-md-10 pt-3">
          <h2>Virement effectué</h2>


            <div class="form-row">
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">#Compte débité : ${requestScope.compteADebiter}</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">#Compte crédité : ${requestScope.compteACrediter}</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Solde initial : ${requestScope.soldeCompteADebiterAvant} €</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Solde après le virement : ${requestScope.soldeCompteADebiterApres} €</label>
                </div>
              </div>

              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Solde initial : ${requestScope.soldeCompteACrediterAvant} €</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <label for="exampleFormControlSelect1">Solde après le virement : ${requestScope.soldeCompteACrediterApres} €</label>
                </div>
              </div>
            </div>
            <div class="form-row">
              <div class="col-md-12">
                <label for="validationCustom03">Montant : ${requestScope.montant} €</label>
              </div>
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
