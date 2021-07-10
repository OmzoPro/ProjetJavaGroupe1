package sn.bank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.IdaoAgence;
import sn.bank.domaine.Agence;

/**
 * Servlet implementation class EditAgence
 */
@WebServlet("/editAgence")
public class EditAgence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAgence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idAgence= Integer.parseInt(request.getParameter("id"));
		
		try {
			IdaoAgence dao= new DaoAgenceImplement();
			Agence agence= dao.SelectAgenceById(idAgence);
			request.setAttribute("agence", agence);
			
			response.getWriter().append("Served at: ").append(request.getContextPath());
			RequestDispatcher dispatcher= request.getRequestDispatcher("jsp/edit_agence.jsp");
			dispatcher.forward(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idAgence = Integer.parseInt(request.getParameter("idAgence"));
        String nom = request.getParameter("nom");
        String adresse = request.getParameter("adresse");
        int telephone = Integer.parseInt(request.getParameter("telephone"));
        String email = request.getParameter("email");

            
        Agence agence = new Agence(idAgence, nom, adresse, telephone, email);
        IdaoAgence dao= new DaoAgenceImplement();
       
        dao.modifier(agence);

        //redirection Apres enregistrement
        //request.getRequestDispatcher("jsp/edit_agent.").forward(request, response);
        response.sendRedirect("listeAgence");
	}

}
