package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Page gérant l’affichage de la liste des comptes d’un client.
 *
 * Pour chaque client, le conseiller peut voir la liste des comptes
 * disponibles : épargne ou courant.
 *
 * On a fait le choix de n’accéder facilement qu’à l’affichage des comptes des
 * clients du conseiller connecté.
 *
 * @author Étienne, Sophia, Maria, Louis
 */
@WebServlet("/ComptesServlet")
public class ComptesServlet extends MereServlet {

	private static final long serialVersionUID = -4042961988530486177L;

	public ComptesServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		int idClient = Integer.parseInt(request.getParameter("idClient"));

		request.setAttribute("listComptes", service.getComptesByID(idClient));
		request.getRequestDispatcher("/WEB-INF/comptes_client.jsp").forward(request, response);

	}

}
