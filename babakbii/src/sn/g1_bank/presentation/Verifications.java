package sn.g1_bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.g1_bank.dao.IdaoAgenceImp;
import sn.g1_bank.dao.IdaoAgentImp;
import sn.g1_bank.dao.IdaoClientImp;
import sn.g1_bank.dao.IdaoCompte;
import sn.g1_bank.dao.IdaoCompteImp;
import sn.g1_bank.domaine.Agence;
import sn.g1_bank.domaine.Agent;
import sn.g1_bank.domaine.Client;
import sn.g1_bank.domaine.Compte;
import sun.management.resources.agent;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/")
public class Verifications extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdaoCompteImp daoC;
	private IdaoClientImp daoC1;
	private IdaoAgentImp daoAgent;
	private IdaoAgenceImp daoAgence;

	public void init() {
		daoC = new IdaoCompteImp();
		daoC1= new IdaoClientImp();
		daoAgent= new IdaoAgentImp();
		daoAgence = new IdaoAgenceImp();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();

		String username = request.getParameter("username");
		String username1 = request.getParameter("compte2");
		
		
		
		
		Compte compte = new Compte();
		Compte compte2 = new Compte();
		
		compte.setNumCompte(username);
		compte2.setNumCompte(username1);
		/////////debut
		
		if (path.equals("/verifieDepot")) {
		

		try {
			boolean verification = daoC.Verifie(username);
			if (verification) {
				HttpSession session1 = request.getSession();
				HttpSession sesD1 = request.getSession();
				HttpSession sessA = request.getSession();
				HttpSession sessAgence = request.getSession();
				
				//recuperation infos compte by Id
				 String numCompte=compte.getNumCompte(); 
				 Compte infosCompte=daoC.donnees(numCompte);
				 session1.setAttribute("cpt1", infosCompte);
				//recuperation infos client by Id
				 int idClient = infosCompte.getIdClient();
				 Client infosClient=daoC1.donneesClient(idClient);
				 sesD1.setAttribute("cli1", infosClient);
				 //recuperation infos agent by Id
				 int idAgent = infosClient.getIdAgent();
				 Agent infosAgent =daoAgent.SelectAgentById(idAgent);
				 sessA.setAttribute("ag1", infosAgent);
				//recuperation infos agence by Id
				 int idAgence =infosAgent.getIdAgence();
				 Agence infosAgence =daoAgence.SelectAgenceById(idAgence);
				 sessAgence.setAttribute("agenc1", infosAgence);
				 
				 
				 
			
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
					HttpSession sesR1 = request.getSession();
					HttpSession Rsessi1 = request.getSession();
					HttpSession Rsessi2 = request.getSession();
					
					 String numCompte1=compte.getNumCompte(); 
					 Compte infosCompte1=daoC.donnees(numCompte1);
					 session2.setAttribute("cpt2", infosCompte1);
					 
					 int idClient1 = infosCompte1.getIdClient();
					 Client infosClient2=daoC1.donneesClient(idClient1);
					 sesR1.setAttribute("cli2", infosClient2);
					 
					//recuperation infos agent by Id
					 int idAgent4 = infosClient2.getIdAgent();
					 Agent infosAgent9 =daoAgent.SelectAgentById(idAgent4);
					 Rsessi1.setAttribute("ragent", infosAgent9);
					//recuperation infos agence by Id
					 int idAgence7 =infosAgent9.getIdAgence();
					 Agence infosAgence5 =daoAgence.SelectAgenceById(idAgence7);
					 Rsessi2.setAttribute("ragenc1", infosAgence5);
					 
					 
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
					HttpSession ss = request.getSession();
					HttpSession sesV1 = request.getSession();
					HttpSession sesV2 = request.getSession();
					HttpSession sesV_a = request.getSession();
					HttpSession sesV_b= request.getSession();
					
					 String numCompte=compte.getNumCompte();
					 String numCompte1=compte2.getNumCompte();
					 
					 Compte infosCompte=daoC.donnees(numCompte);
					 Compte infosCompt2=daoC.donnees(numCompte1);
					 
					 session3.setAttribute("cpt3", infosCompte);
					 ss.setAttribute("cptdest", infosCompt2);
					 
					 int idClient2 = infosCompte.getIdClient();
					 int idclient3=infosCompt2.getIdClient();
					 
					 Client infosClient=daoC1.donneesClient(idClient2);
					 Client infosClient2=daoC1.donneesClient(idclient3);
					 sesV1.setAttribute("cli3", infosClient);
					 sesV2.setAttribute("cli4", infosClient2);
					 
					//recuperation infos agent by Id
					 int idAgent_1 = infosClient.getIdAgent();
					 Agent infosAgent_v =daoAgent.SelectAgentById(idAgent_1);
					 sesV_a.setAttribute("vag1", infosAgent_v);
					 
					//recuperation infos agence by Id
					 int idAgence_2 =infosAgent_v.getIdAgence();
					 Agence infosAgence81 =daoAgence.SelectAgenceById(idAgence_2);
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
	
}
