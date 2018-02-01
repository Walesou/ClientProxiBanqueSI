package com.marlou.controller;



import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marlou.dao.CompteOADException;
import com.marlou.service.ConseillerServiceException;
import com.marlou.webservice.WebService;



/** Page gérant l’affichage de la liste des comptes d’un client.
 *
 * Pour chaque client, le conseiller peut voir la liste des comptes
 * disponibles : épargne ou courant.
 *
 * On a fait le choix de n’accéder facilement qu’à l’affichage des comptes des
 * clients du conseiller connecté.
 *
 * @author Étienne, Sophia et Maria */
public class ComptesServlet extends HttpServlet {

  private static final long serialVersionUID = -4042961988530486177L;


  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    WebService webService = new WebService();
    int idClient = Integer.parseInt(request.getParameter("idClient"));

    try {
    	request.setAttribute("liste", webService.getComptes(idClient));
    	request.getRequestDispatcher("/WEB-INF/comptes_client.jsp").forward(request, response);
    	
    } catch (ConseillerServiceException | CompteOADException e) {
      request.setAttribute("erreur", e.getMessage());
      request.getRequestDispatcher("/WEB-INF/erreur.jsp").include(request,
          response);
      return;
    }


  }



}
