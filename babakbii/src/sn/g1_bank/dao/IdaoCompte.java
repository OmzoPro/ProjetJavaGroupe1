package sn.g1_bank.dao;


import sn.g1_bank.domaine.Compte;

public interface IdaoCompte extends Idao<Compte>{

	public Compte selectCompte(String numCompte);

	

}
