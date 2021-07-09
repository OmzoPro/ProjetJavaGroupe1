package sn.g1_bank.domaine;



public class Agent {
	
    private Integer idAgent;
    private Integer idAgence;
    private String nom;
    private String prenom;
    private String adresse;
    private Integer telephone;
    private String naissance;
    private String dateCrea;
    private String sexe;
    private String email;
    private String grade;
	public Agent() {
		super();
	}
	public Agent(Integer idAgent, Integer idAgence, String nom, String prenom, String adresse, Integer telephone,
			String naissance, String dateCrea, String sexe, String email, String grade) {
		super();
		this.idAgent = idAgent;
		this.idAgence = idAgence;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.naissance = naissance;
		this.dateCrea = dateCrea;
		this.sexe = sexe;
		this.email = email;
		this.grade = grade;
	}
	public Agent(Integer idAgent, String nom, String prenom, String adresse, Integer telephone, String naissance,
			String email) {
		super();
		this.idAgent = idAgent;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.naissance = naissance;
		this.email = email;
	}
	public Integer getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(Integer idAgent) {
		this.idAgent = idAgent;
	}
	public Integer getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(Integer idAgence) {
		this.idAgence = idAgence;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getNaissance() {
		return naissance;
	}
	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}
	public String getDateCrea() {
		return dateCrea;
	}
	public void setDateCrea(String dateCrea) {
		this.dateCrea = dateCrea;
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
    
    
    
    
   
	
}
