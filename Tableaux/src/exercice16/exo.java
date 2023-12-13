package exercice16;

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
		
		for(int j = 0; j < taille; j++)  {
			tableau[j]++;
			System.out.print(tableau[j] + " ");
		}
		
	}

}
