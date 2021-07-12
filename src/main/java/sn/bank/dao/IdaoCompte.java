package sn.bank.dao;


import sn.bank.domaine.Compte;

public interface IdaoCompte extends Idao<Compte>{

	public Compte selectCompte(Double numCompte);

	public Compte donnees(Double numCompte);

	public boolean Verifie(Double numCompete) throws ClassNotFoundException;

	

}
