package exercice9;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombreUn, nombreDeux;
		
		System.out.println("Entrez un premier nombre :");
		nombreUn = clavier.nextInt();

		System.out.println("Entrez un deuxième nombre :");
		nombreDeux = clavier.nextInt();	
		

		boolean AllNumbersAreNegative = (nombreUn < 0 && nombreDeux < 0);
		
		String stringResultat = AllNumbersAreNegative ? "Tous les nombres sont négatifs" : 
			"Au moins un nombre est positif";
		System.out.println(stringResultat);
			
		

	}
}
