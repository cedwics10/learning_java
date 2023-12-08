package exercice2;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombre;
		int carre;
		System.out.println("Entrez n'importe quel nombre ");
		nombre = clavier.nextInt();
		carre = (int) Math.pow(nombre,  2);
		System.out.println("Le carré du nombr eest : " + carre);
	}
}
