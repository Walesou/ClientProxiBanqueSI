package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Page gérant l’affichage de la liste des clients du conseiller. C’est la page
 * d’accueil de l’espace du conseiller.
 *
 * Chaque conseiller peut visualiser l'ensemble de ses clients. Pour chaque
 * client, l'interface lui permet de mettre à jour les informations du client,
 * lister les comptes d'un client ainsi que d'effectuer un virement
 * 
 * 
 * @author Étienne, Sophia, Maria, Louis
 */
@WebServlet("/ClientsServlet")
public class ClientsServlet extends MereServlet {

	private static final long serialVersionUID = -1697049406597216786L;

	public ClientsServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// // TODO Auto-generated method stub

		request.getRequestDispatcher("/WEB-INF/mes_clients.jsp").forward(request, response);

	}

}
