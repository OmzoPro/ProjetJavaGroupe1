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

@WebServlet("/")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();

		String username = request.getParameter("username");
		
		Operation loginBean = new Operation();
		loginBean.setNumCompte(username);
		/////////debut
		
		if (path.equals("/verifieDepot")) {
		

		try {
			if (loginDao.validate(loginBean)) {
				HttpSession session = request.getSession();
				 session.setAttribute("username",username);
				response.sendRedirect("jsp/Depot.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("user", username);
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
				if (loginDao.validate(loginBean)) {
					HttpSession session = request.getSession();
					 session.setAttribute("username",username);
					response.sendRedirect("jsp/Retrait.jsp");
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("user", username);
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
				if (loginDao.validate(loginBean)) {
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
}
