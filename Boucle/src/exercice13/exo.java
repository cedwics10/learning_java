package exercice13;

import java.util.Scanner;

/*
 *  Pour avoir une id�e sur le niveau des �l�ves
 *   d�une classe, on a d�cid� de calculer la moyenne
 *    de la classe � partir des moyennes g�n�rales
 *    de tous les �l�ves qui sont au nombre de 10.
 *    Ecrire un algorithme de r�solution.
 */
public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double note, somme = 0, moyenne;
		final int nombreEleves = 10;
		

		for(int i = 1; i <= nombreEleves; i++)
		{
			System.out.println("Entrez la note de l'�l�ve nu�mro "+ i);
			Scanner scanner = new Scanner(System.in);

			note = scanner.nextDouble();
			somme += note;
		}
		
		moyenne = somme / nombreEleves;
		
		System.out.print("La moyenne de la class est " + moyenne);
	}

}
