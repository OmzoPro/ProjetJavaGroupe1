package sn.bank.dao;

import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.utilis.Connexion;

import java.sql.*;
import java.util.ArrayList;

public class DaoAgenceImplement implements IdaoAgence {
	//Chargement de la connexion
    Connection con= Connexion.connexionBd();
    PreparedStatement pst;
    PreparedStatement pst2;
    Statement stmt;
    ResultSet rs;
	@Override
	public void save(Agence agence) {
		// TODO Auto-generated method stub
		 //Ajout d'un Agent
        String sql="INSERT INTO agence(nomAgence,adresse,telephone,email,dateCrea) VALUES(?,?,?,?,?)";
        //preparation de la requette sql

        try {
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //recuperation des parameter de notre requete
            pst.setString(1, agence.getNomAgence());
            pst.setString(2, agence.getAdresse());
            pst.setInt(3, agence.getTelephone());
            pst.setString(4, agence.getEmail());
            pst.setString(5, agence.getDateCrea());
            //Execution de la requete
            pst.execute();
            System.out.println("Enregistrement agence effectue");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Enregistrement agence non effectue");
            e.printStackTrace();
        }
	}
	
	public ArrayList<Agence> liste() {
        // TODO Auto-generated method stub
        String sql= "SELECT * FROM agence";
        //declaration d'une liste agents
        ArrayList<Agence> listeAgence=new ArrayList<Agence>();
        //preparation de la requete
        try {
            stmt= con.createStatement();
            //Execution de la requete
            rs=stmt.executeQuery(sql);
            //Parcourir du resultat obtenu
            while(rs.next()) {
            	int idAgence=rs.getInt("idAgence");
                String nomAgence=rs.getString("nomAgence");
                String adresse=rs.getString("adresse");
                int telephone=rs.getInt("telephone");
                String email=rs.getString("email");
                	   
                Agence agence=new Agence(idAgence,nomAgence, adresse, telephone, email);
                //Enregistrement des donnees dans la liste
                listeAgence.add(agence);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeAgence;
    }

	@Override
	public Agence SelectAgenceById(int idAgence) {
		// TODO Auto-generated method stub
        String sql= "SELECT * FROM agence WHERE idAgence=?";
        //preparation de la requete
        Agence agence=null;
        try {
            pst= con.prepareStatement(sql);
            pst.setInt(1, idAgence);
            //Execution de la requete
            rs=pst.executeQuery();
            //Parcourir du resultat obtenu
            while(rs.next()) {
                String nomAgence=rs.getString("nomAgence");
                String adresse=rs.getString("adresse");
                int telephone=rs.getInt("telephone");
                String email=rs.getString("email");
                agence=new Agence(idAgence,nomAgence, adresse, telephone, email);
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return agence;
        
	}

	@Override
	public void modifier(Agence agence) {
		//Modifer d'un Agent
        String sql="UPDATE agence set nomAgence=?, adresse=?, telephone=?, email=? WHERE idAgence=?";
        //preparation de la requette sql

        try {
            pst = con.prepareStatement(sql);
            //recuperation des parameter de notre requete
            
            pst.setString(1, agence.getNomAgence());
            pst.setString(2, agence.getAdresse());
            pst.setInt(3, agence.getTelephone());
            pst.setString(4, agence.getEmail());
            pst.setInt(5, agence.getIdAgence());
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
	public Agent SelectAgentAgence(int idAgence) {
		// TODO Auto-generated method stub
		  
        String sql= "SELECT * FROM agent WHERE idAgence=? AND grade=?";
        Agent agentagence=null;
        try {
        pst= con.prepareStatement(sql);
        pst.setInt(1, idAgence);
        pst.setString(2, "agent");
        //Execution de la requete
        rs=pst.executeQuery();
        while(rs.next()) {
            String nom=rs.getString("nom");
            String prenom=rs.getString("prenom");
            String adresse=rs.getString("adresse");
            int telephone=rs.getInt("telephone");
            String email=rs.getString("email");
            agentagence=new Agent(nom,prenom,adresse,telephone,email);
        		
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return agentagence;
	}



}
