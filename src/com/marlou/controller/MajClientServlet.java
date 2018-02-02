package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Traitement de la mise à jour des informations sur un client.
 *
 * @author Étienne, Sophia, Maria, Louis
 */
@WebServlet("/MajClient")
public class MajClientServlet extends MereServlet {

	private static final long serialVersionUID = -5266516954070088318L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		request.setAttribute("clients", service.getTousLesClients());

		request.getRequestDispatcher("/WEB-INF/form_modification_client.jsp").include(request, response);

	}

}
