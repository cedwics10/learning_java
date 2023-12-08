package exercice8;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombreUn;
		
		System.out.println("Entrez un nombre à convertir en positif :");
		nombreUn = clavier.nextInt();
		
		nombreUn = (nombreUn > 0) ? nombreUn : nombreUn * (-1);
		
	
		System.out.println("La valeur absolue du nombre est : " + nombreUn);
	}

}
