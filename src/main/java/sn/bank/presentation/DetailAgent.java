package sn.bank.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoAgentImplement;
import sn.bank.dao.IdaoAgent;
import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.Operation;

/**
 * Servlet implementation class detailAgent
 */
@WebServlet("/detailAgent")
public class DetailAgent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailAgent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idAgent= Integer.parseInt(request.getParameter("id"));
		
		try {
			IdaoAgent dao= new DaoAgentImplement();
			Agent agent= dao.SelectAgentById(idAgent);
			//System.out.print(agent.getIdAgent());
			request.setAttribute("agent", agent);
			
			int idAgence=agent.getIdAgence();
			
			Agence agenceagent=dao.SelectAgenceAgent(idAgence);
			request.setAttribute("agenceagent", agenceagent);
			
	    	//recuparation de la liste des agents
	        int idAgent1=agent.getIdAgent();
	        Client listeClientAgent=dao.listeClientAgent(idAgent1);
	        request.setAttribute("listeClientnAgent", listeClientAgent);
	        if (listeClientAgent!=null) {
	        int idClient=listeClientAgent.getIdClient();
	        Compte compteclientagent=dao.SelectCompteClientAgent(idClient);
	        request.setAttribute("compteclientagent", compteclientagent);
	        request.getRequestDispatcher("jsp/detail_agent.jsp").forward(request, response);
	        }
	        
	        Operation listeOperationAgent=dao.listeOperationAgent(idAgent);
	        request.setAttribute("listeOperationAgent", listeOperationAgent);
	        
			request.getRequestDispatcher("jsp/detail_agent.jsp").forward(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //redirection Apres recuperation
	
        request.getRequestDispatcher("jsp/detail_agent.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
