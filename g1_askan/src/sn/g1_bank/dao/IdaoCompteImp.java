package sn.g1_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sn.g1_bank.domaine.Client;
import sn.g1_bank.domaine.Compte;
import sn.g1_bank.utilis.Connexion;

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
	
	
	
	public Compte selectCompte(String numCompte) {
		Compte compte = null;
		String sql ="SELECT * FROM compte WHERE numCompte=?";
		try {
			
			pst=con.prepareStatement(sql);
			pst.setString(1, numCompte);
			rs=pst.executeQuery();
			while (rs.next()) {
				Integer idClient = rs.getInt("idClient");
				Integer idCompte = rs.getInt("idCompte");
				String typeCompte = rs.getString("typeCompte");
				Integer solde = rs.getInt("solde");
				compte = new Compte(idCompte, idClient, numCompte, solde, typeCompte);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
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
	
	

	public boolean Verifie(String numCompte) throws ClassNotFoundException {
		boolean status = false;
		String sql = " select * from compte where numCompte = ?  ";
		
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, numCompte);
			rs=pst.executeQuery();
			if(rs.next()) {
				String numeroCompte = rs.getString("numCompte");
				if(numCompte.equals(numeroCompte)) {
					status=true;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;

		
	}
	
	public Compte donnees(String numCompte) {
		String sql = " select * from compte where numCompte = ?  ";
		
		
		Compte infosCompte = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, numCompte);
			rs=pst.executeQuery();
			while(rs.next()) {
				int idCompte = rs.getInt("idCompte");
				int solde = rs.getInt("solde");
				int idClient = rs.getInt("idClient");
				String typeCompte = rs.getString("typeCompte");
			infosCompte = new Compte(idCompte, idClient, numCompte, solde, typeCompte);		
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infosCompte;
		
	}




}
	


