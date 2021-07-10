package sn.bank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.IdaoAgence;
import sn.bank.domaine.Agence;

/**
 * Servlet implementation class AjoutAgence
 */
@WebServlet("/ajoutAgence")
public class AjoutAgence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutAgence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("jsp/ajout_agence.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	        String nom = request.getParameter("nom");
	        String adresse = request.getParameter("adresse");
	        int telephone = Integer.parseInt(request.getParameter("telephone"));
	        String email = request.getParameter("email");
	        String dateCrea = "12/12/2012";

	        Agence agence = new Agence(nom, adresse, telephone, email,dateCrea);
	        IdaoAgence dao= new DaoAgenceImplement();
	       
	        dao.save(agence);

	        //recuparation de la liste des agents
	        ArrayList<Agence> listeAgence;
	        listeAgence=dao.liste();
	        request.setAttribute("agence", listeAgence);
	        for (Agence agence1:listeAgence) {
	           String adresseAgent= agence1.getAdresse();
	           request.setAttribute("adresse", adresseAgent);
	        }
	        //redirection Apres enregistrement
	        request.getRequestDispatcher("jsp/list_agence.jsp").forward(request, response);

	}

}
