package sn.g1_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;



import sn.g1_bank.domaine.Client;

import sn.g1_bank.utilis.Connexion;

public class IdaoClientImp  implements IdaoClient{
	Connection con=Connexion.connexionBd();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	@Override
	public void save(Client t) {
		String sql = "INSERT INTO client(nom,prenom,adresse,telephone,naissance,email,sexe,cni,dateCreation) VALUES (?,?,?,?,?,?,?,?,?);";
		// TODO Auto-generated method stub
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, t.getNom());
			pst.setString(2, t.getPrenom());
			pst.setString(3, t.getAdresse());
			pst.setString(4, t.getTelephone());
			pst.setString(5, t.getNaissance());
			pst.setString(6, t.getEmail());
			pst.setString(7, t.getSexe());
			pst.setString(8, t.getCni());
			pst.setString(9, t.getDateCreation());
			pst.execute();
			System.out.println("Enregistrement effectue");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Enregistrement non effectue");
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Client> liste() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM client";
		ArrayList<Client>listClients=new ArrayList<Client>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				String idClient=rs.getString("idClient");
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenom");
				String adresse=rs.getString("adresse");
				String telephone=rs.getString("telephone");
				String naissance=rs.getString("naissance");
				String email=rs.getString("email");
				String sexe=rs.getString("sexe");
				String cni=rs.getString("cni");
				String dateCreation=rs.getString("dateCreation");
				Client client = new Client(idClient, nom, prenom, adresse, telephone, naissance, email, sexe, cni, dateCreation);
				listClients.add(client);
		
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listClients;
	}

	@Override
	public void modifier(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

}
