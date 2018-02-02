package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huios.dao.ClientOADException;
import com.huios.domaine.Client;

/**
 * Page chargé des envois pour la mise à jour des informations des clients.
 *
 * Pour chaque client le conseiller peut modifier les informations suivantes :
 * nom, prénom, courriel et adresse.
 *
 * On a fait le choix de permettre au conseiller d’effectuer de modifier les
 * informations de tous les clients de la banque.
 *
 * @author Étienne, Sophia et Maria
 */
public class EditionServlet extends MereServlet {

	private static final long serialVersionUID = -5266516954070088318L;

	public EditionServlet() {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		/*
		 * TODO : Décider si on permet la modification de plusieurs champs à la fois.
		 */
		int id = Integer.parseInt(request.getParameter("id"));
		String modification = request.getParameter("modification");
		String valeur = request.getParameter("valeur");

		Client client = service.getClientByID(id);
		switch (modification) {
		case "nom":
			client.setNom(valeur);
			break;
		case "prenom":
			client.setPrenom(valeur);
			break;
		case "courriel":
			client.setCourriel(valeur);
			break;
		case "adresse":
			client.setAdresse(valeur);
			break;
		default:
			break;
		}
		try {
			service.majClient(client);
			response.sendRedirect("modifier_client.jsp");

		} catch (ClientOADException e) {
			request.setAttribute("erreur", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/erreur.jsp").include(request, response);
			return;
		}

	}

}
