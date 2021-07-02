package sn.EE_bank.domaine;

public class Compte {


	private Integer idCompte;
	private Integer idClient;
	private String numCompte;
	private Integer solde;
	private String typeCompte;
	
	public Compte() {
		super();
	}

	public Compte(Integer idCompte, Integer idClient, String numCompte, Integer solde, String typeCompte) {
		super();
		this.idCompte = idCompte;
		this.idClient = idClient;
		this.numCompte = numCompte;
		this.solde = solde;
		this.typeCompte = typeCompte;
	}

	public Integer getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Integer getSolde() {
		return solde;
	}

	public void setSolde(Integer solde) {
		this.solde = solde;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	
	
	
	

}
