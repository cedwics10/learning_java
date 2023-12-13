package exercice15;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inverser un tableau sans utiliser un auter tableau.
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la longueur de votre tableau : ");
		int taille = clavier.nextInt();
		
		int[] tableauUn = new int[taille];
		int[] tableauDeux = new int[taille];
		int[] tableauTrois = new int[taille];
		
		for (int i = 0; i < taille; i++) {
			System.out.println("Saisir l'élément " + i + " du tableau un");
			int saisie = clavier.nextInt();
			tableauUn[i] = saisie;
		}
		
		
		for (int j = 0; j < taille; j++) {
			System.out.println("Saisir l'élément " + j + " du tableau deux");
			int saisie = clavier.nextInt();
			tableauDeux[j] = saisie;
		}
		
		int schtroumph = 0;
		
		for (int t1 = 0; t1 < taille; t1++) {
			for(int t2 = 0; t2 < taille; t2++)
			{
				schtroumph += tableauUn[t1] * tableauDeux[t2];
 			}
			
			
		}

		System.out.println("Voici le schtroumph : " + schtroumph);

	}

}
