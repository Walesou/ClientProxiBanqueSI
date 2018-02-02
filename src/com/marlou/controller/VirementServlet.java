package com.marlou.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huios.domaine.Client;

/**
 * Accueil pour le virement compte à compte.
 *
 * Pour chaque client, le conseiller peut effectuer un virement compte à compte.
 *
 * On a fait le choix de permettre au conseiller d’effectuer des virements pour
 * tous les comptes de la banque.
 *
 * @author Étienne, Sophia, Maria, Louis
 */
@WebServlet("/VirementServlet")
public class VirementServlet extends MereServlet {

	private static final long serialVersionUID = 5879732995666268168L;

	public VirementServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		List<Client> clients = service.getTousLesClients();
		for (Client client : clients) {
			client.setComptes(service.getComptesByID(client.getIdentifiant()));
		}

		request.setAttribute("clients", clients);

		request.getRequestDispatcher("/WEB-INF/form_effectuer_virement.jsp").include(request, response);

	}

}
