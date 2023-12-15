package exo;

import java.util.ArrayList;
import java.util.Scanner;

public class Correction {
	static ArrayList<String> taches = new ArrayList();
	static Scanner clavier = new Scanner();

	public static void main(String[] args) {
		int choix;
		
		do {
			choix = clavier.nextInt();
			afficherMenu();
			faireChoix(choix);
			
		} while (choix != 4);
	}

	public static void afficherMenu() {

	}
	
	public static void afficheCollection() 
	{

	}

	public static void faireChoix(int choix) {

	}

}
