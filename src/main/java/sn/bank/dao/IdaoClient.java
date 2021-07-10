package sn.bank.dao;

import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.User;

public interface IdaoClient extends Idao<Client> {
    public void ajoutClient(String nom, String prenom, String adresse, int telephone, String email, String naissance,
			String dateCreation, Double cni, String sexe);
    public Client SelectClientById(int idClient);
	public void save(Client client,User user, Compte compte);
    
}
