package exercice8;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int[] saisies;
		int[] occurences;
		int nombreSaisiesUniques = 0;
		
		int nombreDeSaisies, saisieCourante;
		
		System.out.println("Entrez le nombre de saiises :");
		
		nombreDeSaisies = clavier.nextInt();
		
		saisies = new int[nombreDeSaisies];
		occurences = new int[nombreDeSaisies];
		
		for(int i = 0; i < nombreDeSaisies; i++)
		{
			System.out.println("Saisir une nouvelle valeur :");
			
			saisieCourante = clavier.nextInt();
			
			boolean histoNonIncremnete = true;
			
			for(int cleSaisie = 0; cleSaisie < nombreSaisiesUniques; cleSaisie++)
			{
				boolean saisieDejaEntree = (saisieCourante == saisies[cleSaisie]);
				
				if(saisieDejaEntree) {
					occurences[cleSaisie]++;
					histoNonIncremnete = false;
				}
			}
			
			if(histoNonIncremnete)
			{
				saisies[nombreSaisiesUniques] = saisieCourante;
				occurences[nombreSaisiesUniques] = 1;
				nombreSaisiesUniques++;
			}
		}
		
		
		System.out.println("Liste des saisies :");
		for(int val:saisies)
		{
			System.out.println(val);
		}
		
		
		System.out.println("Liste des occurences : ");
		
		for(int val:occurences)
		{
			System.out.println(val);
		}
	}

}
