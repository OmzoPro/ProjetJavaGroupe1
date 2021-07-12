package sn.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.User;
import sn.bank.utilis.Connexion;

public class DaoClientImplement implements IdaoClient{
    //Chargement de la connexion
    Connection con= Connexion.connexionBd();
    PreparedStatement pst;
    PreparedStatement pst2;
    PreparedStatement pst3;
    Statement stmt;
    ResultSet rs;

	@Override
	public void save(Client client, User user, Compte compte) {
		// TODO Auto-generated method stub
		  //Ajout d'un Agent
        String sql="INSERT INTO client(nom,prenom,adresse,telephone,email,naissance,dateCreation,sexe,cni,idAgent) VALUES(?,?,?,?,?,?,?,?,?,?)";
        String sql2="INSERT into user(login,password,role,idClient) VALUES(?,?,?,?)";
        String sql3="INSERT into compte(idClient,numCompte,solde) VALUES(?,?,?)";
        //preparation de la requette sql

        try {
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //recuperation des parameter de notre requete
            pst.setString(1, client.getNom());
            pst.setString(2, client.getPrenom());
            pst.setString(3, client.getAdresse());
            pst.setInt(4, client.getTelephone());
            pst.setString(5, client.getEmail());
            pst.setString(6, client.getNaissance());
            pst.setString(7, client.getDateCreation());
            pst.setString(8, client.getSexe());
            pst.setDouble(9, client.getCni());
            pst.setInt(10, client.getIdAgent());
            //Execution de la requete
            Long idreturn =(long) pst.executeUpdate();
            rs=pst.getGeneratedKeys();
            Long idClient=0L;
            
            if (rs.next()) {
            	idClient=rs.getLong(1);
            	if (idreturn==1){
  
            		pst2 = con.prepareStatement(sql2);
                    //recuperation des parameter de notre requete
                    pst2.setString(1, user.getLogin());
                    pst2.setString(2, user.getPassword());
                    pst2.setString(3, user.getRole());
                    pst2.setLong(4, idClient);
                    //Execution de la requete
                    pst2.executeUpdate();
                    
                    pst3 = con.prepareStatement(sql3);
                    //recuperation des parameter de notre requete
                    pst3.setLong(1, idClient);
                    pst3.setDouble(2, compte.getNumCompte());
                    pst3.setDouble(3, compte.getSolde());
                    //Execution de la requete
                    pst3.executeUpdate();
                    System.out.println("Enregistrement dans compte effectue");
            	}
            }
            
            System.out.println("Enregistrement effectue");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Enregistrement non effectue");
            e.printStackTrace();
        }
        
	}

	@Override
	public void modifier(Client client) {
		// TODO Auto-generated method stub
		 //Modifer un client
        String sql="UPDATE client set nom=?, prenom=?, adresse=?, telephone=?, naissance=?, email=? WHERE idClient=?";
        //preparation de la requette sql

        try {
            pst = con.prepareStatement(sql);
            //recuperation des parameter de notre requete
            
            pst.setString(1, client.getNom());
            pst.setString(2, client.getPrenom());
            pst.setString(3, client.getAdresse());
            pst.setInt(4, client.getTelephone());
            pst.setString(5, client.getNaissance());
            pst.setString(6, client.getEmail());
            pst.setInt(7, client.getIdClient());
            //Execution de la requete
            pst.executeUpdate();
            System.out.println("Modification effectué");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Modification non effectue");
            e.printStackTrace();
        }

	}

	@Override
	public ArrayList<Client> liste() {
		// TODO Auto-generated method stub
		 String sql= "SELECT * FROM client";
	        //declaration d'une liste agents
	        ArrayList<Client> listeClient=new ArrayList<Client>();
	        //preparation de la requete
	        try {
	            stmt= con.createStatement();
	            //Execution de la requete
	            rs=stmt.executeQuery(sql);
	            //Parcourir du resultat obtenu
	            while(rs.next()) {

	                int idClient=rs.getInt("idClient");
	                String nom=rs.getString("nom");
	                String prenom=rs.getString("prenom");
	                String adresse=rs.getString("adresse");
	                int telephone=rs.getInt("telephone");
	                String naissance=rs.getString("naissance");
	                String email=rs.getString("email");
	                	   
	                Client client=new Client(idClient,nom, prenom, adresse, telephone, naissance, email);
	                //Enregistrement des donnees dans la liste
	                listeClient.add(client);
	            }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return listeClient;
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Client WHERE idClient=?";
		try {
			pst = con.prepareStatement(sql);
			System.out.println("Supprimer avec succès...");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Client SelectClientById(int idClient) {
		// TODO Auto-generated method stub
		String sql = " select * from client where idClient = ?  ";
		
		
		Client infosClient = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, idClient);
			rs=pst.executeQuery();
			while(rs.next()) {
				int idAgent = rs.getInt("idAgent");
				Double cni = rs.getDouble("cni");
				int telephone = rs.getInt("telephone");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String naissance = rs.getString("naissance");
				String email = rs.getString("email");
				String sexe = rs.getString("sexe");
				String dateCreation = rs.getString("dateCreation");
				
				infosClient = new Client(idClient, nom, prenom, adresse, telephone, email, naissance, dateCreation, cni, sexe, idAgent);		
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infosClient;
				
	}
	@Override
	public void ajoutClient(String nom, String prenom, String adresse, int telephone, String email, String naissance,
			String dateCreation, Double cni, String sexe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
		
	}
}
