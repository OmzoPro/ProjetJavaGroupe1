package sn.bank.dao;


import java.util.ArrayList;

//c'est ic qu'on met les actions
//le T signifie generique
public interface Idao<T> {
    // T la fonction qu'on va appelé depuis la classe domaine
    public void save (T t);
    public void modifier (T t);
    public ArrayList<T> liste();
    public void supprimer(int id);
}
