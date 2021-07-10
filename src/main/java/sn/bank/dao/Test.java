package sn.bank.dao;

public class Test {
	  public String getMat(int n) {
		   //choix de nombre au hasard
		   String str="0123456789";
		   StringBuilder s= new StringBuilder(n);
		   for (int i=0; i<n; i++) {
			   int index= (int)(str.length()*Math.random());
			   s.append(str.charAt(index));
		   }
		   return s.toString();
	   }
	  
	
}
