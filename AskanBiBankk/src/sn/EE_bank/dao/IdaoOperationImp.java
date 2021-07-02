package sn.EE_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import sn.EE_bank.domaine.Operation;
import sn.EE_bank.utilis.Connexion;

public class IdaoOperationImp implements IdaoOperation{
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	@Override
	public void save(Operation t) {
		String sql = "INSERT INTO operation(numCompte,typeOperation,montantOperation,soldeAvant,soldeApres,compteDestinataire,dateOperation,idAgent) VALUES (?,?,?,?,?,?,?,?);";
		try {
			pst = con.prepareStatement(sql);
			//recuperation des parametre de notre requete
			pst.setString(1, t.getNumCompte());
			pst.setString(2, t.getTypeOperation());
			pst.setInt(3, t.getMontantOperation());
			pst.setInt(4, t.getSoldeAvant());
			pst.setInt(5, t.getSoldeApres());
			pst.setString(6, t.getCompteDestinataire());
			pst.setString(7, t.getDateOperation());
			pst.setInt(8, t.getIdAgent());
			//Execution de la requete
			pst.execute();
			System.out.println("Enregistrement effectue");
			
		} catch (Exception e) {
			System.out.println("Enregistrement non effectue");
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
				String numCompte=rs.getString("numCompte");
				String typeOperation=rs.getString("typeOperation");
				Integer montantOperation=rs.getInt("montantOperation");
				Integer soldeAvant=rs.getInt("soldeAvant");
				Integer soldeApres=rs.getInt("soldeApres");
				String compteDestinataire=rs.getString("compteDestinataire");
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
