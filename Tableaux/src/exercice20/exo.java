package exercice20;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// V�rifier l'existence d'un entier

		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };

		Scanner clavier = new Scanner(System.in);
		System.out.println("Taper un entier pour v�rifier son existaence : ");

		int entier = clavier.nextInt();
		boolean entierExiste = false;

		for (int i = 0; i < tab.length; i++) {
			if (entier == tab[i]) {
				entierExiste = true;
				break;
			}
		}
		
		String texte = (entierExiste) ? "oui" : "non";
		System.out.println(texte);

	}

}
