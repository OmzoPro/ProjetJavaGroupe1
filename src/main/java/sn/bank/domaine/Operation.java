package sn.bank.domaine;

public class Operation {
	private int idOperation;
	private Double numCompte;
	private String typeOperation;
	private Double montantOperation;
	private Double soldeAvant;
	private Double soldeApres;
	private Double compteDestinataire;
	private String dateOperation;
	private int idAgent;
	public Operation(Double numCompte, String typeOperation, Double montantOperation, Double soldeAvant,
			Double soldeApres, Double compteDestinataire, String dateOperation, int idAgent) {
		super();
		this.numCompte = numCompte;
		this.typeOperation = typeOperation;
		this.montantOperation = montantOperation;
		this.soldeAvant = soldeAvant;
		this.soldeApres = soldeApres;
		this.compteDestinataire = compteDestinataire;
		this.dateOperation = dateOperation;
		this.idAgent = idAgent;
	}
	public Operation(int idOperation, Double numCompte, String typeOperation, Double montantOperation,
			Double soldeAvant, Double soldeApres, Double compteDestinataire, String dateOperation, int idAgent) {
		super();
		this.idOperation = idOperation;
		this.numCompte = numCompte;
		this.typeOperation = typeOperation;
		this.montantOperation = montantOperation;
		this.soldeAvant = soldeAvant;
		this.soldeApres = soldeApres;
		this.compteDestinataire = compteDestinataire;
		this.dateOperation = dateOperation;
		this.idAgent = idAgent;
	}
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	public Double getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Double numCompte) {
		this.numCompte = numCompte;
	}
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	public Double getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(Double montantOperation) {
		this.montantOperation = montantOperation;
	}
	public Double getSoldeAvant() {
		return soldeAvant;
	}
	public void setSoldeAvant(Double soldeAvant) {
		this.soldeAvant = soldeAvant;
	}
	public Double getSoldeApres() {
		return soldeApres;
	}
	public void setSoldeApres(Double soldeApres) {
		this.soldeApres = soldeApres;
	}
	public Double getCompteDestinataire() {
		return compteDestinataire;
	}
	public void setCompteDestinataire(Double compteDestinataire) {
		this.compteDestinataire = compteDestinataire;
	}
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", numCompte=" + numCompte + ", typeOperation=" + typeOperation
				+ ", montantOperation=" + montantOperation + ", soldeAvant=" + soldeAvant + ", soldeApres=" + soldeApres
				+ ", compteDestinataire=" + compteDestinataire + ", dateOperation=" + dateOperation + ", idAgent="
				+ idAgent + "]";
	}
	
}
