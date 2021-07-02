package sn.EE_bank.presentation;

import java.io.IOException;
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
 * Servlet implementation class InsertCompte
 */
@WebServlet("/InsertCompte")
public class InsertCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCompte() {
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
		// TODO Auto-generated method stub
		
		Integer idClient = Integer.parseInt(request.getParameter("idClient"));
		String numCompte = request.getParameter("numCompte");
		Integer solde = Integer.parseInt(request.getParameter("solde"));
		String typeCompte = request.getParameter("typeCompte");
		
		
	Compte compte = new Compte(null, idClient, numCompte, solde, typeCompte);
	IdaoCompte dao = new IdaoCompteImp();
	
		
	dao.save(compte);
		//recuparation de la liste des operations
		ArrayList<Compte>listComptes;
		listComptes=dao.liste();
		request.setAttribute("comptes", listComptes);
		
		
		
		
		request.getRequestDispatcher("jsp/recueDepot.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
