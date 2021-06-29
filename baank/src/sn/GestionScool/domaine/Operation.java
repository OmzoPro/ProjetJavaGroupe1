package sn.GestionScool.domaine;

public class Operation {
	
	private String idOperation;
	private String numCompte;
	private String typeOperation;
	private String montantOperation;
	private String soldeAvant;
	private String soldeApres;
	private String compteDestinataire;
	private String dateOperation;
	private String 	idAgent;
	public Operation() {
		super();
	}
	public Operation(String idOperation, String numCompte, String typeOperation, String montantOperation,
			String soldeAvant, String soldeApres, String compteDestinataire, String dateOperation, String idAgent) {
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
	public String getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(String idOperation) {
		this.idOperation = idOperation;
	}
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	public String getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(String montantOperation) {
		this.montantOperation = montantOperation;
	}
	public String getSoldeAvant() {
		return soldeAvant;
	}
	public void setSoldeAvant(String soldeAvant) {
		this.soldeAvant = soldeAvant;
	}
	public String getSoldeApres() {
		return soldeApres;
	}
	public void setSoldeApres(String soldeApres) {
		this.soldeApres = soldeApres;
	}
	public String getCompteDestinataire() {
		return compteDestinataire;
	}
	public void setCompteDestinataire(String compteDestinataire) {
		this.compteDestinataire = compteDestinataire;
	}
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public String getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(String idAgent) {
		this.idAgent = idAgent;
	}
	
	

	
	
	
	

}
