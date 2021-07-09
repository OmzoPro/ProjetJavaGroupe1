package sn.g1_bank.domaine;

public class Agent {
	private String idAgent;
    private String idAgence;
    private String nom;
    private String telephone;
    private String naissance;
    private String dateCreation;
    private String sexe;
    private String email;
    private String grade;
    private String prenom;
    private String adresse;
    
	public Agent(String idAgent, String idAgence, String nom, String telephone, String naissance, String dateCreation,
			String sexe, String email, String grade, String prenom, String adresse) {
		super();
		this.idAgent = idAgent;
		this.idAgence = idAgence;
		this.nom = nom;
		this.telephone = telephone;
		this.naissance = naissance;
		this.dateCreation = dateCreation;
		this.sexe = sexe;
		this.email = email;
		this.grade = grade;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Agent() {
		super();
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNaissance() {
		return naissance;
	}

	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
    
	
    
    

	
	
    
    

}
