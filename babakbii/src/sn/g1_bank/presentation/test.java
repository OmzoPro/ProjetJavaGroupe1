package sn.g1_bank.presentation;

import sn.g1_bank.dao.IdaoCompteImp;

public class test {

	public static void main(String[] args) {
		IdaoCompteImp dao = new IdaoCompteImp();
		String numCompte = "789462";
		try {
			boolean ver= dao.Verifie(numCompte);
			if(ver) {
				System.out.println("bonjour");
			}else {
				System.out.println("failed");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
