package exercice21;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vérifier l'existence d'un entier

		int[] tab = { 5,2,7,5,8,8,3,9 };

		Scanner clavier = new Scanner(System.in);
		System.out.println("Taper un entier pour vérifier son existaence : ");

		int entier = clavier.nextInt();
		int positionPremier = -1;
		boolean entierExiste = false;
		
		for (int i = 0; i < tab.length; i++) {
			if (entier == tab[i] && entierExiste == false) {
				entierExiste = true;
				positionPremier = i;
				break;
			}
		}
		
		String texte = (entierExiste) ? 
				"position " + positionPremier : "non";
		System.out.println(texte);

	}

}
