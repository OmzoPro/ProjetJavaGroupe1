package sn.GestionScool.dao;

import java.util.ArrayList;

public interface Idao<T> {
	public void save(T t);
	public ArrayList<T> liste();
	public T modifier(T t);
	public void supprimer(int id);
}
