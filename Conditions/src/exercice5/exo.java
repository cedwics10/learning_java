package exercice5;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombreUn, nombreDeux;
		
		System.out.println("Entrez un premier nombre :");
		nombreUn = clavier.nextInt();

		System.out.println("Entrez un deuxi�me nombre :");
		nombreDeux = clavier.nextInt();	
		
		String stringResultat = (nombreUn > nombreDeux) ?
				"Le premier nombre est le plus grand" :
					"Le deuxi�me nombre est le plus grand";
		
		
		System.out.println(stringResultat);
			
		

	}
}
