package exercice5;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombreElementsPairs = 0, nombreElementsImpairs = 0;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la taille du tableau");
		int taille = clavier.nextInt();
		int[] tableau = new int[taille];
		for (int i = 0; i < taille; i++) {
			System.out.println("Indiquer la valuer de l'élément " + i);
			tableau[i] = clavier.nextInt();
		}
		
		for (int val : tableau) {
			if (val % 2 == 0)
				nombreElementsPairs++;
			else
				nombreElementsImpairs++;
		}

		System.out.println("Le nombre d'élémnets pairs est : " + nombreElementsPairs);
		System.out.println("Le nombre d'élémnets pairs est : " + nombreElementsImpairs);
	}

}
