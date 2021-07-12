package sn.bank.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.bank.dao.DaoUserImplement;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		
		
		DaoUserImplement daoUser = new DaoUserImplement();
		User auth = daoUser.authentification(login, password);
		if (auth!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", auth);
			if(auth.getRole().equals("agent") || auth.getRole().equals("chef_agent")) {
				int idAgent=auth.getIdAgent();
				Agent agentcon=daoUser.authentificationAgent(idAgent);
				session.setAttribute("agentcon", agentcon);
			}else if(auth.getRole().equals("client")) {
				int idClient=auth.getIdClient();
				Client clientcon=daoUser.authentificationClient(idClient);
				session.setAttribute("clientcon", clientcon);
				
				Compte comptecon=daoUser.authentificationCompte(idClient);
				session.setAttribute("comptecon", comptecon);
			}else {
				
			}
			request.getRequestDispatcher("jsp/accueil.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}
	/*	if(auth.equals("agent") || auth.equals("super_admin") || auth.equals("client") || auth.equals("chef_agent") ) {
			session.setAttribute("role", auth);
			request.getRequestDispatcher("jsp/accueil.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}
		*/
		
	}

}
