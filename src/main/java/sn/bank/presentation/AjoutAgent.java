package sn.bank.presentation;

import sn.bank.dao.DaoAgenceImplement;
import sn.bank.dao.DaoAgentImplement;
import sn.bank.dao.IdaoAgence;
import sn.bank.dao.IdaoAgent;
import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.domaine.User;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/ajoutAgent")
public class AjoutAgent extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    			response.getWriter().append("Served at: ").append(request.getContextPath());
    			IdaoAgence dao= new DaoAgenceImplement();
    	    	//recuparation de la liste des agents
    	        ArrayList<Agence> listeAgence;
    	        listeAgence=dao.liste();
    	        request.setAttribute("agence", listeAgence);
    	        
    	    	//redirection Apres recuperation
    	       request.getRequestDispatcher("jsp/ajout_agent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperation des contenues des champs
   
        int idAgence = Integer.parseInt(request.getParameter("idAgence"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        int telephone = Integer.parseInt(request.getParameter("telephone"));
        String naissance = request.getParameter("naissance");
        Date dateCrea=new Date();
        String sexe = request.getParameter("sexe");
        String email = request.getParameter("email");
        String grade = request.getParameter("grade");
        String login = request.getParameter("login");
        String role = request.getParameter("grade");
        String password = request.getParameter("password");


        Agent agent = new Agent(idAgence, nom, prenom, adresse, telephone, naissance, (java.sql.Date) dateCrea, sexe, email, grade);
        User user=new User(login,password,role);
        IdaoAgent dao= new DaoAgentImplement();
       
        dao.save(agent, user);

        //recuparation de la liste des agents
        ArrayList<Agent> listeAgent;
        listeAgent=dao.liste();
        request.setAttribute("agent", listeAgent);
        for (Agent agent1:listeAgent) {
           String adresseAgent= agent1.getAdresse();
           request.setAttribute("adresse", adresseAgent);
        }
        //redirection Apres enregistrement
        request.getRequestDispatcher("jsp/list_agent.jsp").forward(request, response);

    }
}
