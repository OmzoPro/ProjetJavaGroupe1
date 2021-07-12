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
 * Servlet implementation class VerifierRetrait
 */
@WebServlet("/verifierRetrait")
public class VerifierRetrait extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifierRetrait() {
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
				HttpSession session2 = request.getSession();
				HttpSession sesR1 = request.getSession();
				HttpSession Rsessi1 = request.getSession();
				HttpSession Rsessi2 = request.getSession();
				
				 Double numCompte1=compte.getNumCompte(); 
				 Compte infosCompte1=daoC.donnees(numCompte1);
				 session2.setAttribute("cpt2", infosCompte1);
				 
				 IdaoClient daoC1= new DaoClientImplement();
				 int idClient1 = infosCompte1.getIdClient();
				 Client infosClient2=daoC1.SelectClientById(idClient1);
				 sesR1.setAttribute("cli2", infosClient2);
				 
				//recuperation infos agent by Id
				 int idAgent4 = infosClient2.getIdAgent();
				 
				 IdaoAgent daoC3= new DaoAgentImplement();
				 Agent infosAgent9 =daoC3.SelectAgentById(idAgent4);
				 Rsessi1.setAttribute("ragent", infosAgent9);
				//recuperation infos agence by Id
				 int idAgence7 =infosAgent9.getIdAgence();
				 
				 IdaoAgence daoC4= new DaoAgenceImplement();
				 Agence infosAgence5 =daoC4.SelectAgenceById(idAgence7);
				 Rsessi2.setAttribute("ragenc1", infosAgence5);
				 
				 
				request.getRequestDispatcher("jsp/Retrait.jsp").forward(request, response);
			} else {
				
				response.sendRedirect("jsp/verifieRetrait.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
