package com.marlou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huios.domaine.Compte;

/**
 * Traitement de l’action de virement.
 *
 * @author Étienne, Sophia et Maria
 */
public class MajVirementServlet extends MereServlet {

	private static final long serialVersionUID = -3018151515164084048L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		String compteADebiterString = request.getParameter("compteADebiter");
		String compteACrediterString = request.getParameter("compteACrediter");
		String montantString = request.getParameter("montant");

		int numeroCompteADebiter = Integer.parseInt(compteADebiterString);
		int numeroCompteACrediter = Integer.parseInt(compteACrediterString);
		double montant = Double.parseDouble(montantString);

		Compte compteADebiter = null;
		Compte compteACrediter = null;
		// try {
		// compteADebiter = conseillerService.getCompteById(numeroCompteADebiter);
		// compteACrediter = conseillerService.getCompteById(numeroCompteACrediter);
		// } catch (ConseillerServiceException e) {
		// request.setAttribute("erreur", e.getMessage());
		// request.getRequestDispatcher("/WEB-INF/erreur.jsp").include(request,
		// response);
		// return;
		// }

		double soldeCompteADebiterAvant = compteADebiter.getSolde();
		double soldeCompteACrediterAvant = compteACrediter.getSolde();

		// try {
		// conseillerService.effectuerVirement(compteADebiter, compteACrediter,
		// montant);
		// } catch (ConseillerServiceException e) {
		// request.setAttribute("erreur", e.getMessage());
		// request.getRequestDispatcher("/WEB-INF/erreur.jsp").include(request,
		// response);
		// return;
		// }

		double soldeCompteADebiterApres = compteADebiter.getSolde();
		double soldeCompteACrediterApres = compteACrediter.getSolde();

		request.setAttribute("compteADebiter", numeroCompteADebiter);
		request.setAttribute("soldeCompteADebiterAvant", soldeCompteADebiterAvant);
		request.setAttribute("soldeCompteADebiterApres", soldeCompteADebiterApres);
		request.setAttribute("compteACrediter", numeroCompteACrediter);
		request.setAttribute("soldeCompteACrediterAvant", soldeCompteACrediterAvant);
		request.setAttribute("soldeCompteACrediterApres", soldeCompteACrediterApres);
		request.setAttribute("montant", montant);

		request.getRequestDispatcher("/WEB-INF/virement_effectue.jsp").include(request, response);
	}

}
