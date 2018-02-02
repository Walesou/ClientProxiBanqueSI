<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <link rel="icon" href="favicon.ico" />

    <title>Accueil — ProxiBanque</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="css/narrow-jumbotron.css" rel="stylesheet" />
  </head>

  <body>

    <div class="container">
      <header class="header clearfix">
        <nav>
          <ul class="nav nav-pills float-right">
            <li class="nav-item">
              <a class="nav-link active" href="index.jsp">Accueil <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="support.jsp">Support</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="connexion.jsp">Mon espace</a>
            </li>
          </ul>
        </nav>
        <h3 class="text-muted">Proxi<img src="favicon.ico" alt="B"/>anque</h3>
        <h5 class="text-muted">Une banque qu’elle est proche de vous</h5>
      </header>

      <main role="main">

        <div class="jumbotron">
          <h1 class="display-5">Mon espace conseiller</h1>
          <p class="lead">Accédez de manière sécurisée (ou pas) à votre espace de gestion clients</p>
          <p><a class="btn btn-lg btn-success" href="connexion.jsp" role="button">Connexion</a></p>
        </div>

        <div class="marketing">
          <h2>Fonctions à disposition (à terme)</h2>

          <div class="row">
            <div class="col-lg-6">
              <h4>Virement</h4>
              <p>Gestion des virements compte à compte</p>
            </div>

            <div class="col-lg-6">
              <h4>Client</h4>
              <p>Création, modification et suppression de clients</p>
            </div>
            <div class="col-lg-4">
              <h4>Placement</h4>
              <p>Gestion des placements des clients fortunés</p>
            </div>

            <div class="col-lg-4">
              <h4>Crédit</h4>
              <p>Simulation de crédits immobilier et à la consommation</p>
            </div>

            <div class="col-lg-4">
              <h4>Audit</h4>
              <p>Exécution et analyse de l’audit général d’une agence</p>
            </div>
          </div>
        </div>

      </main>

      <footer class="footer">
        <p>Tous droits réservés, ProxiBanque 2018</p>
      </footer>

    </div> <!-- /container -->
  </body>
</html>
