package exercice13;

import java.util.Scanner;

/*
 *  Pour avoir une idée sur le niveau des élèves
 *   d’une classe, on a décidé de calculer la moyenne
 *    de la classe à partir des moyennes générales
 *    de tous les élèves qui sont au nombre de 10.
 *    Ecrire un algorithme de résolution.
 */
public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double note, somme = 0, moyenne;
		final int nombreEleves = 10;
		

		for(int i = 1; i <= nombreEleves; i++)
		{
			System.out.println("Entrez la note de l'élève nuémro "+ i);
			Scanner scanner = new Scanner(System.in);

			note = scanner.nextDouble();
			somme += note;
		}
		
		moyenne = somme / nombreEleves;
		
		System.out.print("La moyenne de la class est " + moyenne);
	}

}
