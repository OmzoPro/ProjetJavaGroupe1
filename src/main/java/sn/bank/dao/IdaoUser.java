package sn.bank.dao;
import sn.bank.domaine.Agent;
import sn.bank.domaine.Client;
import sn.bank.domaine.User;
import sn.bank.domaine.Compte;
public interface IdaoUser extends Idao<User>{
    public User authentification(String login,String password);

    public Agent authentificationAgent(int idAgent);
    public Client authentificationClient(int idClient);
    public Compte authentificationCompte(int idClient);

}
