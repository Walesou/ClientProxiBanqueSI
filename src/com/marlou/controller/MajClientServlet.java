package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Traitement de la mise Ã  jour des informations sur un client.
 *
 * @author Ã‰tienne, Sophia et Maria
 */
public class MajClientServlet extends MereServlet {

	private static final long serialVersionUID = -5266516954070088318L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		// On rÃ©cupÃ¨re les clients du conseiller.
		request.setAttribute("mesClients",
				service.getClientsByConseillerAuthName(request.getUserPrincipal().getName()));
		// On rÃ©cupÃ¨re tous les clients de la banque.
		request.setAttribute("clients", service.getTousLesClients());
		// On renvoie au formulaire dâ€™Ã©dition des clients.
		request.getRequestDispatcher("/WEB-INF/form_modification_client.jsp").include(request, response);

	}

}
