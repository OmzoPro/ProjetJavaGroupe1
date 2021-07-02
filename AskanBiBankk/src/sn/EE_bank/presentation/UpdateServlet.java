package sn.EE_bank.presentation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sn.EE_bank.dao.UpdateCompte;
import sn.EE_bank.domaine.Compte;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * @email Ramesh Fadatare
 * 
 *
	
 */

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UpdateCompte userDAO;
	
	public void init() {
		userDAO = new UpdateCompte();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	
	}



	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("idCompte"));
		int solde = Integer.parseInt(request.getParameter("solde"));
		String numCompte = request.getParameter("numCompte");
		String typeCompte = request.getParameter("typeCpmte");
		int idClient = Integer.parseInt(request.getParameter("inClient"));
		
		Compte jour = new Compte(id, idClient, numCompte, solde, typeCompte);
		userDAO.updateUser(jour);
		
	}

	

}
