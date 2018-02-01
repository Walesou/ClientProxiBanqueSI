package com.marlou.controller;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marlou.dao.ClientOADException;
import com.marlou.service.ConseillerServiceException;
import com.marlou.webservice.WebService;



/** Page gérant l’affichage de la liste des clients du conseiller. C’est la page
 * d’accueil de l’espace du conseiller.
 *
 * Chaque conseiller peut visualiser l'ensemble de ses clients. Pour chaque
 * client, l'interface lui permet de mettre à jour les informations du client
 * ({@link eu.fstk.ProxiBanqueSI.presentation.EditionServlet}), lister les
 * comptes d'un client
 * ({@link eu.fstk.ProxiBanqueSI.presentation.ComptesServlet}) ainsi que
 * d'effectuer un virement
 * ({@link eu.fstk.ProxiBanqueSI.presentation.VirementServlet}).
 *
 * @author Étienne, Sophia et Maria */
public class ClientsServlet extends HttpServlet {

  private static final long serialVersionUID = -1697049406597216786L;



  
  @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	  WebService webService = new WebService();
	  try {
		  request.setAttribute("liste", webService.getTousLesClients());
			request.getRequestDispatcher("/WEB-INF/mes_clients.jsp").forward(request, response);
	     
	    } catch (ConseillerServiceException | ClientOADException e) {
	      request.setAttribute("erreur", e.getMessage());
	      request.getRequestDispatcher("/WEB-INF/erreur.jsp").include(request,
	          response);
	      return;
	    }	
	  
		
	}

 

}
