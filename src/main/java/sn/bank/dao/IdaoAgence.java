package sn.bank.dao;

import java.util.ArrayList;

import sn.bank.domaine.Agence;
import sn.bank.domaine.Agent;

public interface IdaoAgence {
	public void save(Agence agence);

	public ArrayList<Agence> liste();
	public Agence SelectAgenceById(int idAgence);

    public Agent SelectAgentAgence(int idAgence);

	public void modifier(Agence agence);
}
