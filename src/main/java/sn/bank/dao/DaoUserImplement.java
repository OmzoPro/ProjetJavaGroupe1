package sn.bank.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;

import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.User;
import sn.bank.utilis.Connexion;


public class DaoUserImplement implements IdaoUser{
	
	//Chargement de la connexion
		Connection con = Connexion.connexionBd();
		PreparedStatement pst;
		Statement stmt;
		ResultSet rs;

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(User t) {
		// TODO Auto-generated method stub
		//Ajout d'un utilisateur
		String sql = "INSERT INTO user(login,password,role) VALUES(?,?,?)";
		try {
			//preparation de la requette sql
			pst = con.prepareStatement(sql);
			//recuperation des parametres de notre requete
			pst.setString(1, t.getLogin());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getRole());
			/*pst.setInt(4, u.getIdClient());
			pst.setInt(5, u.getIdAgent());*/
			//Execution de la requete
			pst.execute();
			System.out.println("Enregistrement effectue");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Enregistrement non effectue");
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<User> liste() {
		
		String sql = "SELECT * FROM user";	
		//declaration d'une liste utilisateur
		ArrayList<User> listeUser = new ArrayList<>();
		//preparation de la requete
		try {
			stmt = con.createStatement();
			//Execution de la requete
			rs = stmt.executeQuery(sql);
			//Parcourir du resultat obtenu
			while(rs.next()) {
				String lg = rs.getString("login");
				String pwd = rs.getString("password");
				String rl = rs.getString("role");
				int idc = rs.getInt("idClient");
				int ida = rs.getInt("idAgent");
				User user = new User(lg, pwd, rl,idc,ida);
				//Enregistrement des donnees dans la liste
				listeUser.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeUser;
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM user WHERE idUser=?";
		try {
			pst = con.prepareStatement(sql);
			System.out.println("Supprimer avec succès...");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public User authentification(String login, String password) {
		
		String sql = "SELECT * FROM user WHERE login=? AND password=?";
		User user=null;
		try {	
			pst = con.prepareStatement(sql);
			pst.setString(1, login);
			pst.setString(2, password);
			rs = pst.executeQuery();
		while(rs.next()) {
			String login1 = rs.getString("login");
			String password1 = rs.getString("password");
			String role = rs.getString("role");
			int idClient=rs.getInt("idClient");
			int idAgent=rs.getInt("idAgent");
			
			if(login.equals(login1) && password.equals(password1)) {
			user = new User(login1, password1, role, idClient, idAgent);
			}
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	
	}
	

	public Agent authentificationAgent(int idAgent) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM agent WHERE idAgent=?";
		Agent agentCon = null;
		try {	
			pst = con.prepareStatement(sql);
			pst.setInt(1, idAgent);
			rs = pst.executeQuery();
		while(rs.next()) {
			int idAgentcon=rs.getInt("idAgent");
			int idAgence=rs.getInt("idAgence");
			String nomAgent = rs.getString("nom");
			String prenomAgent = rs.getString("prenom");
			String adresseAgent = rs.getString("adresse");
			int telephoneAgent=rs.getInt("telephone");
			String naissanceAgent=rs.getString("naissance");
			Date dateCreaAgent = rs.getDate("dateCrea");
			String sexeAgent = rs.getString("sexe");
			String emailAgent = rs.getString("email");
			String gradeAgent = rs.getString("grade");			 
			    
			agentCon = new Agent(idAgentcon,idAgence, nomAgent, prenomAgent, adresseAgent, telephoneAgent, naissanceAgent, dateCreaAgent, sexeAgent, emailAgent, gradeAgent);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		return agentCon;
	}

	@Override
	public Client authentificationClient(int idClient) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM client WHERE idAgent=?";
		Client clientCon=null;
		try {	
			pst = con.prepareStatement(sql);
			pst.setInt(1, idClient);
			rs = pst.executeQuery();
		while(rs.next()) {
			String nomClient = rs.getString("nom");
			String prenomClient = rs.getString("prenom");
			String adresseClient = rs.getString("adresse");
			int telephoneClient=rs.getInt("telephone");
			String emailClient = rs.getString("email");
			String naissanceClient=rs.getString("naissance");
			String dateCreaClient = rs.getString("dateCreation");
			Double cniClient = rs.getDouble("cni");	
			String sexeClient = rs.getString("sexe");		 
			    
		 clientCon = new Client( nomClient, prenomClient, adresseClient, telephoneClient, emailClient, naissanceClient, dateCreaClient, cniClient, sexeClient);
			
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientCon;
	}




}
