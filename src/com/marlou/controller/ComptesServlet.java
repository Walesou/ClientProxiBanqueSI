package com.marlou.controller;



import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huios.service.ConseillerServiceException;
import com.huios.service.IServiceLocal;




/** Page gérant l’affichage de la liste des comptes d’un client.
 *
 * Pour chaque client, le conseiller peut voir la liste des comptes
 * disponibles : épargne ou courant.
 *
 * On a fait le choix de n’accéder facilement qu’à l’affichage des comptes des
 * clients du conseiller connecté.
 *
 * @author Étienne, Sophia et Maria */
@WebServlet("/ComptesServlet")
public class ComptesServlet extends HttpServlet {

//  private static final long serialVersionUID = -4042961988530486177L;
//
//  @Inject
//  private IServiceLocal service;
//
//  
//  @Override
//  protected void doGet(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//    response.setContentType("text/html");
//    response.setCharacterEncoding("UTF-8");
//
//   
//    int idClient = Integer.parseInt(request.getParameter("idClient"));
//
//    request.setAttribute("liste", service.getComptes(idClient));
//	request.getRequestDispatcher("/WEB-INF/comptes_client.jsp").forward(request, response);
//
//  }



}
