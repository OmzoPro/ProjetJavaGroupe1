package sn.bank.presentation;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.bank.dao.DaoAgentImplement;
import sn.bank.dao.IdaoAgent;
import sn.bank.domaine.Agent;

/**
 * Servlet implementation class EditAgent
 */
@WebServlet("/editAgent")
public class EditAgent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAgent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idAgent= Integer.parseInt(request.getParameter("id"));
		
		try {
			IdaoAgent dao= new DaoAgentImplement();
			Agent agent= dao.SelectAgentById(idAgent);
			//System.out.print(agent.getIdAgent());
			request.setAttribute("agent", agent);
			
			response.getWriter().append("Served at: ").append(request.getContextPath());
			RequestDispatcher dispatcher= request.getRequestDispatcher("jsp/edit_agent.jsp");
			dispatcher.forward(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //Recuperation des contenues des champs
        int idAgent = Integer.parseInt(request.getParameter("idAgent"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        int telephone = Integer.parseInt(request.getParameter("telephone"));
        String naissance = request.getParameter("naissance");
        String email = request.getParameter("email");

            
        Agent agent = new Agent(idAgent, nom, prenom, adresse, telephone, naissance, email);
        IdaoAgent dao= new DaoAgentImplement();
       
        dao.modifier(agent);

        //redirection Apres enregistrement
        //request.getRequestDispatcher("jsp/edit_agent.").forward(request, response);
        response.sendRedirect("listeAgent");

    }
}
