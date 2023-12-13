package exercice13;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inverser un tableau sans utiliser un auter tableau.
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la longueur de votre tableau : ");
		int taille = clavier.nextInt();
		int[] tableau = new int[taille];
		for (int i = 0; i < taille; i++) {
			System.out.println("Saisir l'élément " + i);
			int saisie = clavier.nextInt();
			tableau[i] = saisie;
		}

		for (int j = taille - 1; j >= 0; j--) {
			System.out.println("L'élément " + j + " vaut : "  + tableau[j]);
		}

	}

}
