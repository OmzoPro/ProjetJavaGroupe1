package sn.g1_bank.domaine;

public class Agent {
	private String idAgent;
    private String idAgence;
    private String nom;
    
    
    
	public Agent(String idAgence, String nom) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
	}



	public Agent() {
		super();
	}



	public Agent(String idAgent, String idAgence, String nom) {
		super();
		this.idAgent = idAgent;
		this.idAgence = idAgence;
		this.nom = nom;
	}



	public String getIdAgent() {
		return idAgent;
	}



	public void setIdAgent(String idAgent) {
		this.idAgent = idAgent;
	}



	public String getIdAgence() {
		return idAgence;
	}



	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}
   
	
	
    
    

}
