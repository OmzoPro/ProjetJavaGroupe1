package sn.g1_bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.g1_bank.dao.IdaoCompte;
import sn.g1_bank.dao.IdaoCompteImp;

import sn.g1_bank.domaine.Compte;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/")
public class Verifications extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdaoCompteImp daoC;

	public void init() {
		daoC = new IdaoCompteImp();
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
