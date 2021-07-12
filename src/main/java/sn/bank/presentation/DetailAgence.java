package sn.bank.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.IdaoAgence;
import sn.bank.domaine.Agence;

/**
 * Servlet implementation class DetailAgence
 */
@WebServlet("/detailAgence")
public class DetailAgence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailAgence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int idAgence= Integer.parseInt(request.getParameter("id"));
		IdaoAgence dao= new DaoAgenceImplement();
		Agence agence= dao.SelectAgenceById(idAgence);
		//System.out.print(agent.getIdAgent());
		request.setAttribute("agence", agence);
	
		
		request.getRequestDispatcher("jsp/detail_agence.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
