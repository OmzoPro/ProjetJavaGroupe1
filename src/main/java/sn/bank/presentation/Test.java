package sn.bank.presentation;

import java.util.Date;

import sn.bank.dao.DaoAgentImplement;
import sn.bank.domaine.Agent;
import sn.bank.domaine.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoAgentImplement daoagent= new DaoAgentImplement();
		Agent agent= new Agent(1, "ndiae", "popo", "PA", 776253452, "12/12/12", "12/12/2021", "Masculin", "mzo@gmail.com", "che_agent");
		User user=new User("logina","aaa","agent");
		daoagent.save(agent, user);

	}

}
