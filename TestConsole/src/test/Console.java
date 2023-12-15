package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
	static ArrayList<String> taches = new ArrayList();
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("================\n" 
		+ "=== Todolist ===\n");
				
		int choix = 0;
		
		do {
			displayMenu();
			choix = clavier.nextInt();
			
			makeChoice(choix);
			s
		} while (choix != 4);
		System.out.println("'Goodbye' ");
	}

	public static void displayMenu() {
		System.out.print(
				"================\n"
				+ "1. Ajouter une tâche\n"
				+ "2. Supprimer une tâche\n"
				+ "3. Lister toutes les tâches\n" 
				+ "4. Quitter\n" 
				+ "Votre choix ?\n"
				+ "================\n");
	}
	
	public static void afficheTaches() 
	{
		int taille = taches.size();
		System.out.println("Voici la liste des tâches déjà en cours :");
		if( taille == 0 )
		{
			System.out.println("Aucune tâche en cours.");
		}
		
		for(int i = 0 ; i <  taille; i++)
		{
			System.out.println("[" + i + "]" + " " + taches.get(i));
		}

		System.out.println("----------");
		System.out.println("\n");
	}

	public static void makeChoice(int choix) {
		System.out.println("----------");
		
		if(choix == 1)
		{
			System.out.println("Quelle est la valeur à ajouter ?");
			clavier.nextLine();
			String tache = clavier.nextLine();
			taches.add(tache);
		}
		else if(choix == 2)
		{
			afficheTaches() ;
			System.out.println("Indiquer l'index de la valeur à supprimer :");

			int indexSuppression = clavier.nextInt();
			taches.remove(indexSuppression);
			System.out.println("----------");
		}
		else if(choix == 3)
		{
			 afficheTaches();
		}
	}

}