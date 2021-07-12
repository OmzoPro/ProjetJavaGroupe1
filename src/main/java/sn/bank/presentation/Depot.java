package sn.bank.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sn.bank.dao.IdaoCompte;
import sn.bank.dao.IdaoCompteImp;
import sn.bank.dao.IdaoOperation;
import sn.bank.dao.IdaoOperationImp;
import sn.bank.domaine.Compte;
import sn.bank.domaine.Operation;


/**
 * Servlet implementation class Depot
 */
@WebServlet("/Depot")
public class Depot extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Depot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Double num_compte = Double.parseDouble(request.getParameter("num_compte"));
		String dateO = request.getParameter("dateO");
		String toperation = request.getParameter("toperation");
	
		Double soldeAvant = Double.parseDouble(request.getParameter("soldeAvant"));
		Double montantOperation = Double.parseDouble(request.getParameter("montantOperation"));
		Integer idAgent = Integer.parseInt(request.getParameter("idAgent"));
		
		Double soldeApres = montantOperation+soldeAvant;
		
		// insert vers la table operation
		Operation depot = new Operation(num_compte, toperation, montantOperation, soldeAvant, soldeApres, dateO, idAgent);
		IdaoOperation dao = new IdaoOperationImp();
		// insert vers la table compte
		
		Compte compte = new Compte(num_compte, soldeApres);
		IdaoCompte dao1 = new IdaoCompteImp();
		dao.save(depot);
		
		depot.setIdAgent(idAgent);
		
	
		dao1.modifier(compte);
		
		request.getRequestDispatcher("jsp/recueDepot.jsp").forward(request, response);
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
