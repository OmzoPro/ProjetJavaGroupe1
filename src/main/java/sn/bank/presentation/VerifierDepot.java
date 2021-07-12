package sn.bank.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.DaoAgentImplement;
import sn.bank.dao.DaoClientImplement;
import sn.bank.dao.IdaoAgence;
import sn.bank.dao.IdaoAgent;
import sn.bank.dao.IdaoClient;
import sn.bank.dao.IdaoCompte;
import sn.bank.dao.IdaoCompteImp;
import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;

/**
 * Servlet implementation class VerifierDepot
 */
@WebServlet("/verifierDepot")
public class VerifierDepot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifierDepot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("jsp/verifieDepot.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double nuCompte = Double.parseDouble(request.getParameter("numCompte"));	
		Compte compte = new Compte();
		compte.setNumCompte(nuCompte);

	try {
		IdaoCompte daoC= new IdaoCompteImp();
		boolean verification = daoC.Verifie(nuCompte);
		if (verification) {
			HttpSession session1 = request.getSession();
			HttpSession sesD1 = request.getSession();
			HttpSession sessA = request.getSession();
			HttpSession sessAgence = request.getSession();
			
			//recuperation infos compte by Id
			 Double numCompte=compte.getNumCompte();
			 
			 Compte infosCompte=daoC.donnees(numCompte);
			 session1.setAttribute("cpt1", infosCompte);
			//recuperation infos client by Id
			 int idClient = infosCompte.getIdClient();
			 
			 IdaoClient daoC1= new DaoClientImplement();
			 Client infosClient=daoC1.SelectClientById(idClient);
			 sesD1.setAttribute("cli1", infosClient);
			 //recuperation infos agent by Id
			 int idAgent = infosClient.getIdAgent();
			 
			 IdaoAgent daoC3= new DaoAgentImplement();
			 Agent agent =daoC3.SelectAgentById(idAgent);
			 sessA.setAttribute("ag1", agent);
			 //recuperation infos agence by Id
			 int idAgence =agent.getIdAgence();
			 
			 IdaoAgence daoC4= new DaoAgenceImplement();
			 Agence agentagence =daoC4.SelectAgenceById(idAgence);
			 sessAgence.setAttribute("agenc1", agentagence);
			 
			 
			 
		
			request.getRequestDispatcher("jsp/Depot.jsp").forward(request, response);
		} else {
			
			response.sendRedirect("jsp/verifieDepot.jsp");
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

}
