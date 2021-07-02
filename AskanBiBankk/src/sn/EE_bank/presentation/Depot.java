package sn.EE_bank.presentation;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.EE_bank.dao.IdaoCompte;
import sn.EE_bank.dao.IdaoCompteImp;
import sn.EE_bank.dao.IdaoOperation;
import sn.EE_bank.dao.IdaoOperationImp;
import sn.EE_bank.domaine.Compte;
import sn.EE_bank.domaine.Operation;


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
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String num_compte = request.getParameter("num_compte");
		String dateO = request.getParameter("dateO");
		String toperation = request.getParameter("toperation");
	
		Integer soldeAvant = Integer.parseInt(request.getParameter("soldeAvant"));
		Integer montantOperation = Integer.parseInt(request.getParameter("montantOperation"));
		Integer idAgent = Integer.parseInt(request.getParameter("idAgent"));
		
		Integer soldeApres = montantOperation+soldeAvant;
		
		// insert vers la table operation
		Operation depot = new Operation(null, num_compte, toperation, montantOperation, soldeAvant, soldeApres, null, dateO, idAgent);
		IdaoOperation dao = new IdaoOperationImp();
		// insert vers la table compte
		Compte compte = new Compte(null, null, num_compte, soldeApres, null);
		IdaoCompte dao1 = new IdaoCompteImp();
		dao.save(depot);
	//recuparation de la liste des operations
			ArrayList<Operation>listeOperation;
			listeOperation=dao.liste();
			request.setAttribute("operations", listeOperation);
		
			dao1.modifier(compte);;
		//recuparation de la liste des operations
		ArrayList<Compte>listComptes;
		listComptes=dao1.liste();
		request.setAttribute("comptes", listComptes);
		
		
		
		
		request.getRequestDispatcher("jsp/recueDepot.jsp").forward(request, response);
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}