package exercice2;

import java.util.Scanner;

public class exo {
	/*
	 * 
	 * Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu�� ce
	 * que la r�ponse convienne. En cas de r�ponse sup�rieure � 20, on fera
	 * appara�tre un message : � Plus petit ! �, et inversement, � Plus grand ! � si
	 * le nombre est inf�rieur � 10.
	 *
	 */

	public static void main(String[] args) {
		
		final int MINIMUM = 10;
		final int MAXIMUM = 20; 
		
		boolean tropGrand = true,
				tropPetit = true;
		
		int nombreUtilisateur;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Entrez un nombre compris entre " + MINIMUM + " et " + MAXIMUM + ".");
			nombreUtilisateur = scanner.nextInt();
			
			tropGrand = nombreUtilisateur > MAXIMUM;
			tropPetit = nombreUtilisateur < MINIMUM;
			
			if(tropGrand) System.out.println("Plus petit !");
			if(tropPetit) System.out.println("Plus grand !");
				
		} while (tropGrand || tropPetit);

		System.out.println("Le nobmre entr� est valide : " + nombreUtilisateur);
	}

}