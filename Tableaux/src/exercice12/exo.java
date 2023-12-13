package exercice12;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// Insérer un élément dans un tableau
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la longueur de votre tableau : ");

		int taille = clavier.nextInt();
		int[] tableau = new int[taille];

		for (int i = 0; i < taille; i++) {
			System.out.println("Saisir l'élément " + i);
			int saisie = clavier.nextInt();
			tableau[i] = saisie;
		}

		System.out.println("Ancien tableau : ");
		for (int t = 0; t < taille; t++) {
			System.out.println(tableau[t] + " ");

			System.out.println("Quel élément ajouter :");

			int nouveau = clavier.nextInt();
			int position = -1;

			while (position < 0 || position > tableau.length) {
				System.out.println("En quel position l'ajouter ?");
				position = clavier.nextInt();
			}

			int[] nouveauTableau = new int[taille + 1];

			int decalage = 0;
			
			for (int a = 0; a < taille + 1; a++) {
				nouveauTableau[a] = (a == position) ? nouveau : tableau[a + decalage];
				if (a == position)
					decalage = -1;
			}

			for (int j = 0; j < taille + 1 ; j++) {
				System.out.println("L'élément " + j + " vaut : " + nouveauTableau[j]);
			}
		}

	}
}