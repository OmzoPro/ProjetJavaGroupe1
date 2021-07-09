package sn.g1_bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.g1_bank.dao.IdaoClientImp;
import sn.g1_bank.dao.IdaoCompte;
import sn.g1_bank.dao.IdaoCompteImp;
import sn.g1_bank.domaine.Client;
import sn.g1_bank.domaine.Compte;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/")
public class Verifications extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdaoCompteImp daoC;
	private IdaoClientImp daoC1;

	public void init() {
		daoC = new IdaoCompteImp();
		daoC1= new IdaoClientImp();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();

		String username = request.getParameter("username");
		
		
		
		
		Compte compte = new Compte();
		
		compte.setNumCompte(username);
		/////////debut
		
		if (path.equals("/verifieDepot")) {
		

		try {
			boolean verification = daoC.Verifie(username);
			if (verification) {
				HttpSession session1 = request.getSession();
				
				 String numCompte=compte.getNumCompte(); 
				 Compte infosCompte=daoC.donnees(numCompte);
				 session1.setAttribute("cpt1", infosCompte);
				 int idClient = infosCompte.getIdClient();
				 Client infosClient=daoC1.donneesClient(idClient);
				 session1.setAttribute("cli1", infosClient);
				 
				 
				 
				
				request.getRequestDispatcher("jsp/Depot.jsp").forward(request, response);
			} else {
				
				response.sendRedirect("jsp/verifieDepot.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		//////////fin depot
		///debut retrait
		
		if (path.equals("/verifieRetrait")) {
			try {
				boolean verification = daoC.Verifie(username);
				if (verification) {
					HttpSession session2 = request.getSession();
					 String numCompte=compte.getNumCompte(); 
					 Compte infosCompte=daoC.donnees(numCompte);
					 session2.setAttribute("cpt2", infosCompte);
					 int idClient1 = infosCompte.getIdClient();
					 Client infosClient=daoC1.donneesClient(idClient1);
					 session2.setAttribute("cli2", infosClient);
					request.getRequestDispatcher("jsp/Retrait.jsp").forward(request, response);
				} else {
					
					response.sendRedirect("jsp/verifieRetrait.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}	
		///fin
		///debut
		if (path.equals("/verifieVirement")) {
			try {
				boolean verification = daoC.Verifie(username);
				if (verification) {
					HttpSession session3 = request.getSession();
					 String numCompte=compte.getNumCompte(); 
					 Compte infosCompte=daoC.donnees(numCompte);
					 session3.setAttribute("cpt3", infosCompte);
					 int idClient2 = infosCompte.getIdClient();
					 Client infosClient=daoC1.donneesClient(idClient2);
					 session3.setAttribute("cli3", infosClient);
					request.getRequestDispatcher("jsp/Virement.jsp").forward(request, response);
				} else {
					
					response.sendRedirect("jsp/verifieVirement.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
}
	
}
