package sn.GestionScool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sn.GestionScool.domaine.Operation;
import sn.GestionScool.utilis.Connexion;

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
			pst.setString(3, t.getMontantOperation());
			pst.setString(4, t.getSoldeAvant());
			pst.setString(5, t.getSoldeApres());
			pst.setString(6, t.getCompteDestinataire());
			pst.setString(7, t.getDateOperation());
			pst.setString(8, t.getIdAgent());
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
				String id=rs.getString("idOperation");
				String numCompte=rs.getString("numCompte");
				String typeOperation=rs.getString("typeOperation");
				String montantOperation=rs.getString("montantOperation");
				String soldeAvant=rs.getString("soldeAvant");
				String soldeApres=rs.getString("soldeApres");
				String compteDestinataire=rs.getString("compteDestinataire");
				String dateOperation=rs.getString("dateOperation");
				String idAgent=rs.getString("idAgent");
				Operation operation = new Operation(id, numCompte, typeOperation, montantOperation, soldeAvant, soldeApres, compteDestinataire, dateOperation, idAgent);
				listeOperation.add(operation);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return listeOperation;
	}

	@Override
	public Operation modifier(Operation t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

}
