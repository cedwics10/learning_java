package exercice12;

import java.util.Scanner;

public class exo {
	
	/*  A la naissance de Marie, 
	 * son grand-p�re Nestor, lui ouvre un compte bancaire. 
	 * Ensuite, � chaque anniversaire, le grand p�re de Marie 
	 * verse sur son compte 100 e, auxquels il ajoute le double
	 * de l��ge de Marie. Par exemple, lorsqu�elle a deux ans,
	 * il lui verse 104 e. Ecrire un algorithme qui permette de
	 * d�terminer quelle somme aura Marie lors de son n-i�me
	 * anniversaire
	 */
	public static void main(String[] args) {
		int somme = 0, age;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quel �ge a Marie ?");
		age = scanner.nextInt();
		
		for(int i = 1; i <= age; i++)
		{
			somme += 100 + 2*i;
		}
		
		System.out.println("Marie va gagner " + somme + " euros au total. ");
	}

}

