package sn.bank.dao;

import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.Compte;
import sn.bank.domaine.Operation;
import sn.bank.domaine.User;

public interface IdaoAgent extends Idao<Agent>{
   public Agent SelectAgentById(int idAgent);
    public Agence SelectAgenceAgent(int idAgence);
    public Client listeClientAgent(int idAgent);
    
    public Compte SelectCompteClientAgent(int idClient);
    
    public Operation listeOperationAgent(int idAgent);
    
    public void save(Agent agent,User user);

    public void supprimer(int idAgent);
    
}
