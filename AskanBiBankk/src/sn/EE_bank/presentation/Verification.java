package sn.EE_bank.presentation;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.EE_bank.dao.*;
import sn.EE_bank.domaine.*;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/")
public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdaoVerification verifie;

	public void init() {
		verifie = new IdaoVerification();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();

		String numCompte = request.getParameter("numCompte");
		
		Compte c = new Compte();
		c.setNumCompte(numCompte);
		
		/////////debut
		
		if (path.equals("/verifieDepot")) {
		

		try {
			if (verifie.validate(c)) {
				HttpSession sessionDepot = request.getSession();
				 sessionDepot.setAttribute("sessionDepot",c);
				response.sendRedirect("jsp/Depot.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("user", c);
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
				if (verifie.validate(c)) {
					HttpSession sessionRetrait = request.getSession();
					 sessionRetrait.setAttribute("sessionRetrait",c);
					response.sendRedirect("jsp/Retrait.jsp");
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("user", c);
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
				if (verifie.validate(c)) {
					HttpSession sessionVirement = request.getSession();
					 sessionVirement.setAttribute("sessionVirement",c);
					response.sendRedirect("jsp/Virement.jsp");
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("user", c);
					response.sendRedirect("jsp/verifieVirement.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
}
}
