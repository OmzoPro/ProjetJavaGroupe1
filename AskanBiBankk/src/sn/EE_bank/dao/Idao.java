package sn.EE_bank.dao;

import java.util.ArrayList;

public interface Idao<T> {
	public void save(T t);
	public ArrayList<T> liste();
	public void modifier(T t);
	public void supprimer(int id);
}
