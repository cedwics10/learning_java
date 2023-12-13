package exercice19;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inverser un tableau sans utiliser un auter tableau.
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer le nombre d'élèves de la classe : ");
		int taille = clavier.nextInt();
		int[] tableau = new int[taille];
		for (int i = 0; i < taille; i++) {
			System.out.println("Saisir la note " + i);
			int saisie = clavier.nextInt();
			tableau[i] = saisie;
		}
		
		int somme = 0, moyenne;
		
		System.out.println("Les notes de la classe sont les suivantes :");
		for (int i = 0; i < taille; i++) {
			somme += tableau[i];
			System.out.print(tableau[i] + " ");
		}
		
		System.out.println("");
		
		moyenne = somme / taille;
		
		System.out.println("La moyenne vaut : " + moyenne);
		
		for (int i = 0; i < taille; i++) {
			if(tableau[i] > moyenne)
				System.out.println("La note " + tableau[i] + " en position " + i + " est supérieure à la moyenne de la classe");
		}

	}

}
