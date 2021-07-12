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
 * Servlet implementation class VerifierVirement
 */
@WebServlet("/verifierVirement")
public class VerifierVirement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifierVirement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("jsp/verifieVirement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double nuCompte = Double.parseDouble(request.getParameter("numCompte"));	
		Compte compte = new Compte();
		compte.setNumCompte(nuCompte);

		Double nuCompte2 = Double.parseDouble(request.getParameter("numCompte2"));

		Compte compte2 = new Compte();
		compte2.setNumCompte(nuCompte2);
		try {
			IdaoCompte daoC= new IdaoCompteImp();
			boolean verification = daoC.Verifie(nuCompte);
			if (verification) {
				HttpSession session3 = request.getSession();
				HttpSession ss = request.getSession();
				HttpSession sesV1 = request.getSession();
				HttpSession sesV2 = request.getSession();
				HttpSession sesV_a = request.getSession();
				HttpSession sesV_b= request.getSession();
				
				 Double numCompte=compte.getNumCompte();
				 Double numCompte1=compte2.getNumCompte();
				 
				 Compte infosCompte=daoC.donnees(numCompte);
				 Compte infosCompt2=daoC.donnees(numCompte1);
				 
				 session3.setAttribute("cpt3", infosCompte);
				 ss.setAttribute("cptdest", infosCompt2);
				 
				 int idClient2 = infosCompte.getIdClient();
				 int idclient3=infosCompt2.getIdClient();
				 IdaoClient daoC1= new DaoClientImplement();
				 Client infosClient=daoC1.SelectClientById(idClient2);
				 Client infosClient2=daoC1.SelectClientById(idclient3);
				 sesV1.setAttribute("cli3", infosClient);
				 sesV2.setAttribute("cli4", infosClient2);
				 
				//recuperation infos agent by Id
				 int idAgent_1 = infosClient.getIdAgent();
				 IdaoAgent daoC3= new DaoAgentImplement();
				 Agent infosAgent_v =daoC3.SelectAgentById(idAgent_1);
				 sesV_a.setAttribute("vag1", infosAgent_v);
				 
				//recuperation infos agence by Id
				 int idAgence_2 =infosAgent_v.getIdAgence();
				 IdaoAgence daoC4= new DaoAgenceImplement();
				 Agence infosAgence81 =daoC4.SelectAgenceById(idAgence_2);
				 sesV_b.setAttribute("vagenc1", infosAgence81);
				 
				 
				request.getRequestDispatcher("jsp/Virement.jsp").forward(request, response);
			} else {
				
				response.sendRedirect("jsp/verifieVirement.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
