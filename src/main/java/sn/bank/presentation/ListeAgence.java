package sn.bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.domaine.Agence;
import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.IdaoAgence;

/**
 * Servlet implementation class ListeAgence
 */
@WebServlet("/listeAgence")
public class ListeAgence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeAgence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		IdaoAgence dao= new DaoAgenceImplement();
    	//recuparation de la liste des agents
        ArrayList<Agence> listeAgence;
        listeAgence=dao.liste();
        request.setAttribute("agence", listeAgence);
        
    	//redirection Apres recuperation
        request.getRequestDispatcher("jsp/list_agence.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
