package exercice7;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int nombreUn, nombreDeux, nombreTrois;
		System.out.print("Entrez le premier nombre :");
		nombreUn = clavier.nextInt();
		System.out.print("Entrez le deuxième nombre :");
		nombreDeux = clavier.nextInt();
		System.out.print("Entrez le troisième nombre :");
		nombreTrois = clavier.nextInt();
		
		boolean numberAreOrdered = 
				(nombreUn < nombreDeux) && (nombreDeux < nombreTrois);
		
		String textToShow  = numberAreOrdered ?
				"Les nombres sont dans l'ordre"
				: "Les nombres sont dans le désordre";
		System.out.println(textToShow);
	}	


}
