package sn.EE_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sn.EE_bank.domaine.Compte;
import sn.EE_bank.utilis.Connexion;

public class IdaoVerification {
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;
	
	public boolean validate(Compte c) throws ClassNotFoundException{
		boolean status = false;
		
		
		
		String sql ="SELECT * FROM compte WHERE numCompte = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, c.getNumCompte());
			rs=pst.executeQuery();
			status = rs.next();
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		
		}
		return status;
	}

}
