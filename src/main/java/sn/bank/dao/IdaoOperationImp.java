package sn.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import sn.bank.domaine.Operation;
import sn.bank.utilis.Connexion;

public class IdaoOperationImp implements IdaoOperation{
	Connection con= Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	@Override
	public void save(Operation operation) {
		String sql = "INSERT INTO operation(numCompte,typeOperation,montantOperation,soldeAvant,soldeApres,dateOperation,idAgent) VALUES (?,?,?,?,?,?,?);";
		try {
			pst = con.prepareStatement(sql);
			//recuperation des parametre de notre requete
			pst.setDouble(1, operation.getNumCompte());
			pst.setString(2, operation.getTypeOperation());
			pst.setDouble(3, operation.getMontantOperation());
			pst.setDouble(4, operation.getSoldeAvant());
			pst.setDouble(5, operation.getSoldeApres());
			pst.setString(6, operation.getDateOperation());
			pst.setInt(7, operation.getIdAgent());
			//Execution de la requete
			pst.execute();
			System.out.println("Enregistrement operation effectue");
			
		} catch (Exception e) {
			System.out.println("Enregistrement operation non effectue");
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Operation> liste() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM operation";
		ArrayList<Operation>listeOperation =new ArrayList<Operation>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Integer idOperation=rs.getInt("idOperation");
				Double numCompte=rs.getDouble("numCompte");
				String typeOperation=rs.getString("typeOperation");
				Double montantOperation=rs.getDouble("montantOperation");
				Double soldeAvant=rs.getDouble("soldeAvant");
				Double soldeApres=rs.getDouble("soldeApres");
				Double compteDestinataire=rs.getDouble("compteDestinataire");
				String dateOperation=rs.getString("dateOperation");
				Integer idAgent=rs.getInt("idAgent");
				Operation operation = new Operation(idOperation, numCompte, typeOperation, montantOperation, soldeAvant, soldeApres, compteDestinataire, dateOperation, idAgent);
				listeOperation.add(operation);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listeOperation;
	}

	@Override
	public void modifier(Operation t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}



	

}
