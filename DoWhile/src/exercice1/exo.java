package exercice1;

import java.util.Scanner;

/*
 * 1-    Ecrire un algorithme qui demande � l�utilisateur 
 * un nombre compris entre 1 et 3
 * jusqu�� ce que la r�ponse convienne.
 */
public class exo {

	public static void main(String[] args) {
		int nombreUtilisateur;
		Scanner scanner = new Scanner(System.in);
		
		
		do
		{
			System.out.println("Entrez un nombre compris entre 1 et 3.");
			nombreUtilisateur = scanner.nextInt();
		}
			while(nombreUtilisateur < 1 || nombreUtilisateur > 3);
	
		
		System.out.println("Le nobmre entr� est valide : " + nombreUtilisateur);
	}

}
