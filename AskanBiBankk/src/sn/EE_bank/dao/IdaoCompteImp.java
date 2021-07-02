package sn.EE_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import sn.EE_bank.domaine.Compte;
import sn.EE_bank.utilis.Connexion;

public class IdaoCompteImp implements IdaoCompte {
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public void save(Compte t) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO compte(idClient,numCompte,solde,typeCompte) VALUES (?,?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, t.getIdClient());
			pst.setString(2, t.getNumCompte());
			pst.setInt(3, t.getSolde());
			pst.setString(4, t.getTypeCompte());
			pst.execute();
			System.out.println("Enregistrement effectue");
		} catch (Exception e) {
			System.out.println("Enregistrement non effectue");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public ArrayList<Compte> liste() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM compte";
		ArrayList<Compte>listeCompte = new ArrayList<Compte>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Integer idCompte = rs.getInt("idCompte");
				Integer idClient = rs.getInt("idClient");
				String numCompte = rs.getString("numCompte");
				Integer solde = rs.getInt("solde");
				String typeCompte = rs.getString("typeCompte");
				Compte compte=new Compte(idCompte, idClient, numCompte, solde, typeCompte);
				listeCompte.add(compte);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listeCompte;
	}
	
	
	
	public Compte selectCompte(int idCompte) {
		Compte compte = null;
		String sql ="Select idCompte,idClient,numCompte,solde,typeCompte from compte where idCompte=?";
		try {
			stmt = con.createStatement();
			pst=con.prepareStatement(sql);
			pst.setInt(1, idCompte);
			rs=pst.executeQuery();
			while (rs.next()) {
				Integer idClient = rs.getInt("idClient");
				String numCompte = rs.getString("numCompte");
				String typeCompte = rs.getString("typeCompte");
				Integer solde = rs.getInt("solde");
				compte = new Compte(idCompte, idClient, numCompte, solde, typeCompte);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// Step 1: Establishing a Connection
		return compte;
	}
	@Override
	public void modifier(Compte t) {
		// TODO Auto-generated method stub
		String sql="UPDATE compte set solde=? WHERE numCompte=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, t.getSolde());
			pst.setString(2, t.getNumCompte());
			pst.execute();
			System.out.println("mis a jour du solde  effectue");
		} catch (Exception e) {
			System.out.println("mis a jour du solde non effectue");
			// TODO: handle exception
		}
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
