package sn.GestionScool.presentation;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.GestionScool.dao.*;
import sn.GestionScool.domaine.*;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/verifieVirement")
public class VerifieVirement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdaoVirement virement;

	public void init() {
		virement = new IdaoVirement();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String username = request.getParameter("compte");
		String password = request.getParameter("compte2");
		
		
		Operation loginBean = new Operation();
		loginBean.setNumCompte(username);
		loginBean.setNumCompte(password);
		/////////debut
		
		
		

		try {
			if (virement.validate(loginBean)) {
				HttpSession session = request.getSession();
				 session.setAttribute("username",username);
				response.sendRedirect("jsp/Virement.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("user", username);
				response.sendRedirect("jsp/verifieVirement.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		}
		
}

