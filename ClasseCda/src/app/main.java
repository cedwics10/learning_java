package app;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nbr;
		System.out.println("Donnez votre prénom :");
		prenom = clavier.nextLine();
		System.out.println("Donnez votre âge");
		age = clavier.nextInt();
		System.out.println("Bonjour" + prenom + ", âge : " + age);
		

	}
}
