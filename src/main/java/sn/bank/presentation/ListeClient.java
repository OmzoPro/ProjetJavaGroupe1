package sn.bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoClientImplement;
import sn.bank.dao.IdaoClient;
import sn.bank.domaine.Client;

/**
 * Servlet implementation class ListeClient
 */
@WebServlet("/listeClient")
public class ListeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		IdaoClient dao= new DaoClientImplement();
    	//recuparation de la liste des agents
        ArrayList<Client> listeClient;
        listeClient=dao.liste();
        request.setAttribute("client", listeClient);
        for (Client client:listeClient) {
           String adresseClient= client.getAdresse();
           request.setAttribute("adresse", adresseClient);
        }
    	//redirection Apres recuperation
        request.getRequestDispatcher("jsp/list_client.jsp").forward(request, response);

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
