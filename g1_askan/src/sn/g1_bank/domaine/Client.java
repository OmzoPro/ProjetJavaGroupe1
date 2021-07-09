package sn.g1_bank.domaine;

public class Client {
	private Integer idClient;
	private Integer idAgent;
	private  String nom;
	private  String prenom;
	private String adresse;
	private Integer telephone;
	private String naissance;
	private String email;
	private String sexe;
	private Integer cni;
	private String dateCreation;
	
	
	public Client() {
		super();
	}

	public Client(Integer idClient,Integer idAgent, String nom, String prenom, String adresse, Integer telephone, String naissance,
			String email, String sexe, Integer cni, String dateCreation) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.naissance = naissance;
		this.email = email;
		this.sexe = sexe;
		this.cni = cni;
		this.dateCreation = dateCreation;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Integer getCni() {
		return cni;
	}

	public void setCni(Integer cni) {
		this.cni = cni;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Integer getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Integer idAgent) {
		this.idAgent = idAgent;
	}


	

}
