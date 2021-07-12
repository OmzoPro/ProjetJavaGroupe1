package sn.bank.domaine;

public class Compte {
	private int idCompte;
	private int idClient;
	private Double numCompte;
	private Double solde;
	private String typeCompte;
	public Compte(int idCompte, int idClient, Double numCompte, Double solde) {
		super();
		this.idCompte = idCompte;
		this.idClient = idClient;
		this.numCompte = numCompte;
		this.solde = solde;
	}
	public Compte(int idClient, Double numCompte, Double solde) {
		super();
		this.idClient = idClient;
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	
	public Compte(Double numCompte, Double solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	public Compte(int idCompte, int idClient, Double numCompte, Double solde, String typeCompte) {
		super();
		this.idCompte = idCompte;
		this.idClient = idClient;
		this.numCompte = numCompte;
		this.solde = solde;
		this.typeCompte = typeCompte;
	}
	public Compte(Double numCompte, Double solde, String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.typeCompte=typeCompte;
	}
	public Compte() {
		// TODO Auto-generated constructor stub
	}
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Double getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Double numCompte) {
		this.numCompte = numCompte;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", idClient=" + idClient + ", numCompte=" + numCompte + ", solde="
				+ solde + ", typeCompte=" + typeCompte + "]";
	}
	
	
	
	

}
