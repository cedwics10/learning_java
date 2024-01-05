package banque;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static String url = "jdbc:mysql://localhost:3306/banque";
	private static String utilisateur = "root";
	private static String motDePasse = "";
	public static Connection connexion = null;
	
	public static void connect() 	 {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connexion =DriverManager.getConnection(url,utilisateur,motDePasse);
			System.out.println("CONNEXION DB OK");
		} catch (Exception ex) {
	    	  ex.printStackTrace();
	    	  System.out.println("PROBLEME CONNEXION DB");
	      }

	}
	
}
