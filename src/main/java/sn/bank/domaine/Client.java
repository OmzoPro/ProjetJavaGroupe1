package sn.bank.domaine;

/**
 * @author omarndiaye
 *
 */

public class Client {
	private int idClient;	
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	private String email;
	private String naissance;
	private String dateCreation;
	private Double cni;
	private String sexe;
	private int idAgent;
	
	public Client() {
		super ();
	}
	
	public Client(String nom, String prenom, String adresse, int telephone, String email, String naissance,
			String dateCreation, Double cni, String sexe, int idAgent) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.naissance = naissance;
		this.dateCreation = dateCreation;
		this.cni = cni;
		this.sexe = sexe;
		this.idAgent = idAgent;
	}

	public Client(String nom, String prenom, String adresse, int telephone, String email, String naissance,
			String dateCreation, Double cni, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.naissance = naissance;
		this.dateCreation = dateCreation;
		this.cni = cni;
		this.sexe = sexe;
	}

	public Client(int idClient, String nom, String prenom, String adresse, int telephone, String email,
			String naissance) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.naissance = naissance;
	}

	public Client(int idClient, String nom, String prenom, String adresse, int telephone, String email,
			String naissance, String dateCreation, Double cni, String sexe) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.naissance = naissance;
		this.dateCreation = dateCreation;
		this.cni = cni;
		this.sexe = sexe;
	}
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
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

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Double getCni() {
		return cni;
	}

	public void setCni(Double cni) {
		this.cni = cni;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", email=" + email + ", naissance=" + naissance + ", dateCreation="
				+ dateCreation + ", cni=" + cni + ", sexe=" + sexe + ", idAgent=" + idAgent + "]";
	}

	
	
	
	

}
