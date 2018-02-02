package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Page gérant la déconnexion d’un utilisateur.
 *
 * @author Étienne, Sophia et Maria
 */
@WebServlet("/DeconnexionServlet")
public class DeconnexionServlet extends HttpServlet {

	private static final long serialVersionUID = -3239495810626390996L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		request.logout();
		// ou
		// request.getSession().invalidate();
		// ou
		/*
		 * HttpSession session = request.getSession(); if (session != null) {
		 * session.invalidate(); }
		 */

		// response.sendRedirect(request.getContextPath() + "index.jsp");
		request.getRequestDispatcher("index.jsp").include(request, response);

	}

}
