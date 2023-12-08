package exercice12;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		String stringResult;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Choisissez le premier nombre : ");
		x = clavier.nextInt();

		System.out.println("Choisissez le second nombre : ");
		y = clavier.nextInt();
		
		
		stringResult = (y >= x) ? (x + " <= " + y) : (y + " <= " + x);
		
		System.out.print("Liste des nombres par ordre croissant : " + stringResult);
	}

}
