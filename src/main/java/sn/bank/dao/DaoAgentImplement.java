package sn.bank.dao;

import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.Operation;
import sn.bank.domaine.User;
import sn.bank.utilis.Connexion;

import java.sql.*;
import java.util.ArrayList;

public class DaoAgentImplement implements IdaoAgent{
    //Chargement de la connexion
    Connection con= Connexion.connexionBd();
    PreparedStatement pst;
    PreparedStatement pst2;
    Statement stmt;
    ResultSet rs;
    ResultSet rs2;
    @Override
    public void save(Agent agent, User user) {
        //Ajout d'un Agent
        String sql="INSERT INTO agent(idAgence,nom,prenom,adresse,telephone,naissance,dateCrea,sexe,email,grade) VALUES(?,?,?,?,?,?,?,?,?,?)";
        String sql2="INSERT into user(login,password,role,idAgent) VALUES(?,?,?,?)";
        //preparation de la requette sql

        try {
        	con.setAutoCommit(false);
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //recuperation des parameter de notre requete
            pst.setInt(1, agent.getIdAgence());
            pst.setString(2, agent.getNom());
            pst.setString(3, agent.getPrenom());
            pst.setString(4, agent.getAdresse());
            pst.setInt(5, agent.getTelephone());
            pst.setString(6, agent.getNaissance());
            pst.setString(7, agent.getDateCrea());
            pst.setString(8, agent.getSexe());
            pst.setString(9, agent.getEmail());
            pst.setString(10, agent.getGrade());
            //Execution de la requete
            
          
            int idreturn = pst.executeUpdate();
            rs=pst.getGeneratedKeys();
            int idClient=0;
            
            if (rs.next()) {
            	idClient=rs.getInt(1);
            	if (idreturn==1){
  
            		pst2 = con.prepareStatement(sql2);
                    //recuperation des parameter de notre requete
                    pst2.setString(1, user.getLogin());
                    pst2.setString(2, user.getPassword());
                    pst2.setString(3, user.getRole());
                    pst2.setLong(4, idClient);
                    //Execution de la requete
                    pst2.execute();
            	}
            	con.commit();
            	System.out.println("Enregistrement effectue");
            }else {
            	con.rollback();
            }
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Enregistrement non effectue");
            e.printStackTrace();
        }
        


    }

    @Override
    public void modifier(Agent agent) {
  
    	 //Modifer d'un Agent
        String sql="UPDATE agent set nom=?, prenom=?, adresse=?, telephone=?, naissance=?, email=? WHERE idAgent=?";
        //preparation de la requette sql

        try {
            pst = con.prepareStatement(sql);
            //recuperation des parameter de notre requete
            
            pst.setString(1, agent.getNom());
            pst.setString(2, agent.getPrenom());
            pst.setString(3, agent.getAdresse());
            pst.setInt(4, agent.getTelephone());
            pst.setString(5, agent.getNaissance());
            pst.setString(6, agent.getEmail());
            pst.setInt(7, agent.getIdAgent());
            //Execution de la requete
            pst.executeUpdate();
            System.out.println("Modification effectué");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("Modification non effectue");
            e.printStackTrace();
        }

    }


    public ArrayList<Agent> liste() {
        // TODO Auto-generated method stub
        String sql= "SELECT * FROM agent";
        //declaration d'une liste agents
        ArrayList<Agent> listeAgent=new ArrayList<Agent>();
        //preparation de la requete
        try {
            stmt= con.createStatement();
            //Execution de la requete
            rs=stmt.executeQuery(sql);
            //Parcourir du resultat obtenu
            while(rs.next()) {

                int idAgent=rs.getInt("idAgent");
                String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
                int telephone=rs.getInt("telephone");
                String naissance=rs.getString("naissance");
                String email=rs.getString("email");
                	   
                Agent agent=new Agent(idAgent,nom, prenom, adresse, telephone, naissance, email);
                //Enregistrement des donnees dans la liste
                listeAgent.add(agent);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeAgent;
    }
    
    @Override
    public void supprimer(int idAgent) {
    	String sql = "DELETE FROM Agent WHERE idAgent=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, idAgent);
			System.out.println("Supprimé avec succès...");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

    }


	@Override
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
                int idAgence=rs.getInt("idAgence");
                String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
                int telephone=rs.getInt("telephone");
                String naissance=rs.getString("naissance");
                String email=rs.getString("email");
                agent=new Agent(idAgent,idAgence, nom, prenom, adresse, telephone, naissance, email);
              
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return agent;
        
	}

	@Override
	public void save(Agent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agence SelectAgenceAgent(int idAgence) {
		// TODO Auto-generated method stub
		  
        String sql= "SELECT * FROM agence WHERE idAgence=?";
        Agence agenceagent=null;
        try {
        pst= con.prepareStatement(sql);
        pst.setInt(1, idAgence);
        //Execution de la requete
        rs=pst.executeQuery();
        while(rs.next()) {
            String nomAgence=rs.getString("nomAgence");
            String adresseAgence=rs.getString("adresse");
            int telephoneAgence=rs.getInt("telephone");
            String emailAgence=rs.getString("email");
            agenceagent=new Agence(idAgence, nomAgence,  adresseAgence,  telephoneAgence,  emailAgence);
        		
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return agenceagent;
	}



	@Override
	public Client listeClientAgent(int idAgent) {
		// TODO Auto-generated method stub
		String sql= "SELECT * FROM client WHERE idAgent=?";
        //declaration d'une liste des operations de l'agent
        Client listeClientAgent=null;
        //preparation de la requete
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
	            String email=rs.getString("email");
	            String naissance=rs.getString("naissance");
	            String dateCreation=rs.getString("dateCreation");
	            Double cni=rs.getDouble("cni");
	            String sexe=rs.getString("sexe");
	            listeClientAgent =new Client( nom,prenom,adresse, telephone,email,naissance,dateCreation, cni,sexe, idAgent);
	        		
	            //Enregistrement des donnees dans la liste
               
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeClientAgent;
	}

	@Override
	public Compte SelectCompteClientAgent(int idClient) {
		// TODO Auto-generated method stub
		String sql= "SELECT * FROM compte WHERE idClient=?";
        Compte compteclientagent=null;
        try {
        pst= con.prepareStatement(sql);
        pst.setInt(1, idClient);
        //Execution de la requete
        rs=pst.executeQuery();
        while(rs.next()) {
            Double numCompte=rs.getDouble("numCompte");
            Double solde=rs.getDouble("solde");
            compteclientagent=new Compte(idClient, numCompte,solde);
        		
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return compteclientagent;
	}

	@Override
	public Operation listeOperationAgent(int idAgent) {
		// TODO Auto-generated method stub
		String sql= "SELECT * FROM operation WHERE idAgent=?";
        //declaration d'une liste des operations de l'agent
        Operation listeOperationAgent=null;
        //preparation de la requete
        try {
        	pst= con.prepareStatement(sql);
            pst.setInt(1, idAgent);
            //Execution de la requete
            rs=pst.executeQuery();
            //Parcourir du resultat obtenu
            while(rs.next()) {
            	Double numCompte=rs.getDouble("numCompte");
                String typeOperation=rs.getString("typeOperation");
            	Double montantOperation=rs.getDouble("montantOperation");
            	Double soldeAvant=rs.getDouble("soldeAvant");
            	Double soldeApres=rs.getDouble("soldeApres");
            	Double compteDestinataire=rs.getDouble("compteDestinataire");
                String dateOperation=rs.getString("dateOperation");
                	   
                listeOperationAgent =new Operation(numCompte,typeOperation, montantOperation, soldeAvant,
            		 soldeApres, compteDestinataire,  dateOperation, idAgent);
                //Enregistrement des donnees dans la liste
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeOperationAgent;
    }

	

	
}



