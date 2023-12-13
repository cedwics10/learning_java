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
		for (int i = 0; i < taille; i++) {
			System.out.println("Saisir l'élément " + i);
			int saisie = clavier.nextInt();
			tableauUn[i] = saisie;
		}
		
		int[] tableauDeux = new int[taille];
		for (int j = 0; j < taille; i++) {
			System.out.println("Saisir l'élément " + i);
			int saisie = clavier.nextInt();
			tableauDeux[j] = saisie;
		}

		for (int j = taille - 1; j >= 0; j--) {
			System.out.println("L'élément " + j + " vaut : "  + tableau[j]);
		}

	}

}
