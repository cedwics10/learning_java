package exercice18;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la taille du tableau");
		int taille = clavier.nextInt();
		int[] tableau = new int[taille];
		for (int i = 0; i < taille; i++) {
			System.out.println("Indiquer la valuer de l'élément " + i);
			tableau[i] = clavier.nextInt();
		}
		
		int valeurPremier = 0;
		int clePremier = -1;
		
		int valeurDeuxieme = 0;
		int cleDeuxieme = -1;
		
		for (int i = 0; i < taille; i++) {
			
			boolean	estPremierepOisiton = i == 0 || tableau[i] > valeurPremier;
			boolean estDeuxiemePosition = (i == 1)
					|| (tableau[i] > valeurDeuxieme
							&& tableau[i] < valeurPremier);
					
			if(estPremierepOisiton)
			{
				if(clePremier != -1)
				{
					valeurDeuxieme = valeurPremier;
					cleDeuxieme = clePremier;
				}
				
				valeurPremier = tableau[i];
				clePremier = i;
			}
			else if(estDeuxiemePosition)
			{
				valeurDeuxieme = tableau[i];
				cleDeuxieme = i;
			}

		}
		
		System.out.println("Le maximum est la valeur '"
		+ valeurPremier + "' à la clé " + clePremier);
	
		System.out.println("Le nombre en deuxième position est la valuer '"
		+ valeurDeuxieme + "' à la clé " + cleDeuxieme);
		
	}

}
