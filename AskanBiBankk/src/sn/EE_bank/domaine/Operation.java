package sn.EE_bank.domaine;

public class Operation {
	
	private Integer idOperation;
	private String numCompte;
	private String typeOperation;
	private Integer montantOperation;
	private Integer soldeAvant;
	private Integer soldeApres;
	private String compteDestinataire;
	private String dateOperation;
	private Integer 	idAgent;
	public Operation() {
		super();
	}
	public Operation(Integer idOperation, String numCompte, String typeOperation, Integer montantOperation,
			Integer soldeAvant, Integer soldeApres, String compteDestinataire, String dateOperation, Integer idAgent) {
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
	public Integer getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(Integer idOperation) {
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
	public Integer getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(Integer montantOperation) {
		this.montantOperation = montantOperation;
	}
	public Integer getSoldeAvant() {
		return soldeAvant;
	}
	public void setSoldeAvant(Integer soldeAvant) {
		this.soldeAvant = soldeAvant;
	}
	public Integer getSoldeApres() {
		return soldeApres;
	}
	public void setSoldeApres(Integer soldeApres) {
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
	public Integer getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(Integer idAgent) {
		this.idAgent = idAgent;
	}
	
	
	
	

	
	
	
	

}
