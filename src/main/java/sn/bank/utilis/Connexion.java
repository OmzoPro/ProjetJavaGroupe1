package sn.bank.utilis;

import java.sql.DriverManager;
import java.sql.Connection;

public class Connexion {
	 private static String Driver="com.mysql.cj.jdbc.Driver";
	    private static String url="jdbc:mysql://localhost:3306/abbank";
	    private static String login="root";
	    private static String password="lovemymom";
	    private static Connection con;

	    public static Connection connexionBd() {
	        //Chargement du Driver
	        try {
	           Class.forName(Driver);
	            System.out.println("Chemin de la base trouve");
	            //Chargement de la base de donnees
	            con= DriverManager.getConnection(url,login,password);
	            System.out.println("Connexion a la base de donnees reussi");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return con;

	    }
	
	}
	
	


