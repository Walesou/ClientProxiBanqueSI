package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huios.domaine.Conseiller;
import com.huios.service.ConseillerServiceException;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends MereServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthentificationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);

		String login = request.getParameter("j_username");
		String pass = request.getParameter("j_password");

		try {
			if (service.verifAuthentification(login, pass) != false) {
				
				session.setAttribute("clients", service.getClientsByConseillerAuthName(login));
				request.getRequestDispatcher("/WEB-INF/mes_clients.jsp").forward(request, response);
				return;
				
			}else {
				request.getRequestDispatcher("/WEB-INF/erreur_connexion.jsp").forward(request, response);
			}
			
		} catch (IOException | ConseillerServiceException c) {
			// TODO Auto-generated catch block
			request.getRequestDispatcher("/WEB-INF/erreur_connexion.jsp").forward(request, response);
			c.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
