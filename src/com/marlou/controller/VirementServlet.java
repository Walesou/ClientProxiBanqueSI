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
 * @author Étienne, Sophia et Maria
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

		/*
		 * // On récupère tous les clients de la banque. List<Client> clients =
		 * service.getTousLesClients();
		 * 
		 * 
		 * for (Client client : clients) {
		 * client.setComptes(service.getComptes(client.getIdentifiant())); }
		 * 
		 * request.setAttribute("clients", clients); // On récupère les clients du
		 * conseiller. // Oui, c’est pas optimal ; mais le conseiller a au maximum dix
		 * clients, // donc ça reste un choix valable. List<Client> mesClients =
		 * service.getClientsByConseillerAuthName(request.getUserPrincipal().getName());
		 * // Pour chaque client, on récupère ses comptes et on les ajoute à // l’objet.
		 * // C’est fastidieux, mais c’est la joie de la persistance « à la // mano ».
		 * for (Client client : mesClients) {
		 * client.setComptes(service.getComptes(client.getIdentifiant())); }
		 * request.setAttribute("mesClients", mesClients); // On affiche le formulaire.
		 * request.getRequestDispatcher("/WEB-INF/form_effectuer_virement.jsp").include(
		 * request, response);
		 */

	}

}
