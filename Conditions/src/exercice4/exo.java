package exercice4;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int nombreArticles;
		double prixHT, prixTVA;
		
		final double TVA = 0.2;

		System.out.println("Entrez un prix de l'article hors taxe :");
		prixHT = clavier.nextDouble();

		System.out.println("Entrez le nombre d'unités de l'article :");
		nombreArticles = clavier.nextInt();

		prixTVA = prixHT * (1 + TVA) * nombreArticles ;

		System.out.println("Le prix avec TVA des " + nombreArticles  
				+ " articles vaut : " + prixTVA);

	}
}
