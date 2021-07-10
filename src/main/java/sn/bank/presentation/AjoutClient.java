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
import sn.bank.domaine.Compte;
import sn.bank.domaine.User;

/**
 * Servlet implementation class AjoutClient
 */
@WebServlet("/ajoutClient")
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
    	//redirection Apres recuperation
        request.getRequestDispatcher("jsp/ajout_client.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //Recuperation des contenues des champs
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        int telephone = Integer.parseInt(request.getParameter("telephone"));
        String naissance = request.getParameter("naissance");
        String email = request.getParameter("email");
        String dateCreation = request.getParameter("dateCreation");
        String sexe = request.getParameter("sexe");
        String login = request.getParameter("login");
        String role = request.getParameter("role");
        String password = request.getParameter("password");
        Double cni = Double.parseDouble(request.getParameter("cni"));
        Double numCompte =Math.random()*1000000000;
        Double solde = Double.parseDouble(request.getParameter("solde"));
        int idAgent = Integer.parseInt(request.getParameter("idAgent"));
     
        

        Client client = new Client( nom,  prenom,  adresse,  telephone,  email,  naissance, dateCreation,  cni,  sexe,idAgent);
        User user=new User(login,password,role);
        Compte compte =new Compte(numCompte,solde );
        IdaoClient dao= new DaoClientImplement();
       
       
        
        IdaoClient dao2= new DaoClientImplement();
        dao2.save(client, user, compte);

        //recuparation de la liste des clients
        ArrayList<Client> listeClient;
        listeClient=dao.liste();
        request.setAttribute("client", listeClient);
        for (Client client1:listeClient) {
           String adresseclient= client1.getAdresse();
           request.setAttribute("adresse", adresseclient);
        }
        //redirection Apres enregistrement
        request.getRequestDispatcher("jsp/list_client.jsp").forward(request, response);

    }


}
