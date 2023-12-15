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
				+ "1. Ajouter une t�che\n"
				+ "2. Supprimer une t�che\n"
				+ "3. Lister toutes les t�ches\n" 
				+ "4. Quitter\n" 
				+ "Votre choix ?\n"
				+ "================\n");
	}
	
	public static void afficheTaches() 
	{
		int taille = taches.size();
		System.out.println("Voici la liste des t�ches d�j� en cours :");
		if( taille == 0 )
		{
			System.out.println("Aucune t�che en cours.");
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
			System.out.println("Quelle est la valeur � ajouter ?");
			clavier.nextLine();
			String tache = clavier.nextLine();
			taches.add(tache);
		}
		else if(choix == 2)
		{
			afficheTaches() ;
			System.out.println("Indiquer l'index de la valeur � supprimer :");

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