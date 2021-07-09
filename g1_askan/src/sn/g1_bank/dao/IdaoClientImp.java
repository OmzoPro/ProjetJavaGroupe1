package sn.g1_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.Clinit;

import sn.g1_bank.domaine.Client;
import sn.g1_bank.domaine.Compte;
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
			pst.setInt(4, t.getTelephone());
			pst.setString(5, t.getNaissance());
			pst.setString(6, t.getEmail());
			pst.setString(7, t.getSexe());
			pst.setInt(8, t.getCni());
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
				int idClient=rs.getInt("idClient");
				int idAgent=rs.getInt("idAgent");
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenom");
				String adresse=rs.getString("adresse");
				int telephone=rs.getInt("telephone");
				String naissance=rs.getString("naissance");
				String email=rs.getString("email");
				String sexe=rs.getString("sexe");
				int cni=rs.getInt("cni");
				String dateCreation=rs.getString("dateCreation");
				Client client = new Client(idClient,idAgent, nom, prenom, adresse, telephone, naissance, email, sexe, cni, dateCreation);
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
	
	public Client donneesClient(int idClient) {
		String sql = " select * from client where idClient = ?  ";
		
		
		Client infosClient = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, idClient);
			rs=pst.executeQuery();
			while(rs.next()) {
				int cni = rs.getInt("cni");
				int telephone = rs.getInt("telephone");
				int idAgent = rs.getInt("idAgent");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				String naissance = rs.getString("naissance");
				String email = rs.getString("email");
				String sexe = rs.getString("sexe");
				String dateCreation = rs.getString("dateCreation");
				
				infosClient = new Client(idClient,idAgent,nom, prenom, adresse, telephone, naissance, email, sexe, cni, dateCreation);		
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infosClient;
		
	}

}
