package exercice14;

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
		
		for (int k = 0; k < taille; k++) {

			tableauTrois[k] = tableauUn[k] + tableauDeux[k];
		}

		for (int l = 0; l < taille; l++) {
			System.out.print(tableauTrois[l] + " ");
		}

	}

}
