package exercice1;

//Importing utility classes 
import java.util.*; 

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		String prenom;
		System.out.println("Entrez votre prénom");
		prenom = clavier.nextLine();
		System.out.println("Bonjour" + prenom);

	}

}
