package sn.GestionScool.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.util.converter.LocalDateTimeStringConverter;
import sn.GestionScool.dao.IdaoOperation;
import sn.GestionScool.dao.IdaoOperationImp;
import sn.GestionScool.domaine.Operation;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


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
		String soldeApres = request.getParameter("soldeApres");
		String toperation = request.getParameter("toperation");
		String soldeAvant = request.getParameter("soldeAvant");
		String montantOperation = request.getParameter("montantOperation");
		String idAgent = request.getParameter("idAgent");
		
		Operation depot = new Operation(null, num_compte, toperation, montantOperation, soldeAvant, soldeApres, null, dateO, idAgent);
		IdaoOperation dao = new IdaoOperationImp();
		dao.save(depot);
		//recuparation de la liste des operations
		ArrayList<Operation> listeOperation;
		listeOperation=dao.liste();
		request.setAttribute("operations", listeOperation);
		
		request.getRequestDispatcher("jsp/recueDepot.jsp").forward(request, response);
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
