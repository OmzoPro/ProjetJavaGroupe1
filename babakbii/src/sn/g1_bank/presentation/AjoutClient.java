package sn.g1_bank.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.g1_bank.dao.IdaoClient;
import sn.g1_bank.dao.IdaoClientImp;
import sn.g1_bank.domaine.Client;

/**
 * Servlet implementation class AjoutClient
 */
@WebServlet("/AjoutClient")
public class AjoutClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("Prenom");
		String naissance = request.getParameter("dateNaissance");
		String sexe = request.getParameter("sexe");
		Integer cni = Integer.parseInt(request.getParameter("cni"));
		Integer telephone = Integer.parseInt(request.getParameter("telephone"));
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String dateCreation = request.getParameter("dateCreation");
		Integer idAgent = Integer.parseInt(request.getParameter("idAgent"));
		
		
		Client client = new Client(null, idAgent,nom, prenom, adresse, telephone, naissance, email, sexe, cni, dateCreation);
		IdaoClient doa = new IdaoClientImp();
		doa.save(client);
		
	
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}