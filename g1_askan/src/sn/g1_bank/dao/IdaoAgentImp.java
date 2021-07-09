package sn.g1_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import sn.g1_bank.domaine.Agent;
import sn.g1_bank.utilis.Connexion;

public class IdaoAgentImp implements IdaoAgent{
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	@Override
	public void save(Agent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Agent> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifier(Agent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}
	public Agent SelectAgentById(int idAgent) {
		// TODO Auto-generated method stub
        String sql= "SELECT * FROM agent WHERE idAgent=?";
        //preparation de la requete
        Agent agent=null;
        try {
            pst= con.prepareStatement(sql);
            pst.setInt(1, idAgent);
            //Execution de la requete
            rs=pst.executeQuery();
            //Parcourir du resultat obtenu
            while(rs.next()) {
                String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
                int telephone=rs.getInt("telephone");
                String naissance=rs.getString("naissance");
                String email=rs.getString("email");
                agent=new Agent(idAgent, nom, prenom, adresse, telephone, naissance, email);
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return agent;
        
	}

}
