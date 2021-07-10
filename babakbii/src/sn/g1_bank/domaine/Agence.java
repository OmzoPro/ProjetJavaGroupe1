package sn.g1_bank.domaine;

public class Agence {
	private int idAgence;
	private String nomAgence;
	private String adresse;
	private int telephone;
	private String email;
	private String dateCreation;
	
	public Agence(int idAgence, String nomAgence, String adresse, int telephone, String email, String dateCreation) {
		super();
		this.idAgence = idAgence;
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.dateCreation = dateCreation;
	}

	public Agence() {
		super();
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
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

	public String getDateCrea() {
		return dateCreation;
	}

	public void setDateCrea(String dateCrea) {
		this.dateCreation = dateCrea;
	}
	
	
	
	

}
