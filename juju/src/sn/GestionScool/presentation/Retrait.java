package sn.GestionScool.presentation;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sn.GestionScool.dao.IdaoOperation;
import sn.GestionScool.dao.IdaoOperationImp;
import sn.GestionScool.domaine.Operation;

/**
 * Servlet implementation class Depot
 */
@WebServlet("/Retrait")
public class Retrait extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrait() {
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
	
		
		String client1 = request.getParameter("compte1");
		String client2 = request.getParameter("compte2");
		String client3 = request.getParameter("dateO");
		String client4 = request.getParameter("soldeP");
		String client5 = request.getParameter("toperation");
		String client6 = request.getParameter("solde");
		String client7 = request.getParameter("montantOperation");
		String client8 = request.getParameter("idAgent");
		
		Operation depot = new Operation(null, client1, client5, client7, client6, client4, client2, client3, client8);
		IdaoOperation dao = new IdaoOperationImp();
		dao.save(depot);
		request.getRequestDispatcher("jsp/recueRetrait.jsp").forward(request, response);
		
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
