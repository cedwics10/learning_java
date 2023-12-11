package exercice12;

import java.util.Scanner;

public class exo {
	
	/*  A la naissance de Marie, 
	 * son grand-père Nestor, lui ouvre un compte bancaire. 
	 * Ensuite, à chaque anniversaire, le grand père de Marie 
	 * verse sur son compte 100 e, auxquels il ajoute le double
	 * de l’âge de Marie. Par exemple, lorsqu’elle a deux ans,
	 * il lui verse 104 e. Ecrire un algorithme qui permette de
	 * déterminer quelle somme aura Marie lors de son n-ième
	 * anniversaire
	 */
	public static void main(String[] args) {
		int somme = 0, age;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quel âge a Marie ?");
		age = scanner.nextInt();
		
		for(int i = 1; i <= age; i++)
		{
			somme += 100 + 2*i;
		}
		
		System.out.println("Marie va gagner " + somme + " euros au total. ");
	}

}

