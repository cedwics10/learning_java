package exercice4;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		double prixHT, prixTVA;
		
		System.out.println("Entrez un prix hors taxe :");
		prixHT = clavier.nextDouble();
		
		prixTVA = prixHT * 1.2;
		
			
		
		
		System.out.println("Le prix abvec TVA vaut : " + prixTVA);
			
		

	}
}
