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
	private IdaoCompteImp c;

	public void init() {
		c = new IdaoCompteImp();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();

		String username = request.getParameter("username");
		
		Compte compte = new Compte();
		IdaoCompte dao1 =new IdaoCompteImp();
		compte.setNumCompte(username);
		/////////debut
		
		if (path.equals("/verifieDepot")) {
		

		try {
			if (c.Verifie(compte)) {
				ArrayList<Compte>listComptes;
				listComptes=dao1.liste();
				request.setAttribute("comptes", listComptes);
				HttpSession session1 = request.getSession();
				 session1.setAttribute("sessionDepot",compte);
				response.sendRedirect("jsp/Depot.jsp");
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
				if (c.Verifie(compte)) {
					HttpSession session2 = request.getSession();
					 session2.setAttribute("sessionRetrait",compte);
					response.sendRedirect("jsp/Retrait.jsp");
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
				if (c.Verifie(compte)) {
					
					HttpSession session3 = request.getSession();
					 session3.setAttribute("sessionVirement",compte);
					response.sendRedirect("jsp/Virement.jsp");
				} else {
					
					response.sendRedirect("jsp/verifieVirement.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
}
	
}
