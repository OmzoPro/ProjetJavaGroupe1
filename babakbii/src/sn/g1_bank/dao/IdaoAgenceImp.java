package sn.g1_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sn.g1_bank.domaine.Agence;
import sn.g1_bank.domaine.Agent;
import sn.g1_bank.utilis.Connexion;

public class IdaoAgenceImp implements IdaoAgence{
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;


	@Override
	public void save(Agence t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Agence> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifier(Agence t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}
	public Agence SelectAgenceById(int idAgence) {
		// TODO Auto-generated method stub
        String sql= "SELECT * FROM agence WHERE idAgence=?";
        //preparation de la requete
        Agence infosAgence=null;
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
                String dateCrea=rs.getString("dateCreation");
                String email=rs.getString("email");
                infosAgence=new Agence(idAgence, nomAgence, adresse, telephone, email, dateCrea);
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return infosAgence;
        
	}

}
