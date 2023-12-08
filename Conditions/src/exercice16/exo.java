package exercice16;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		final int MIN_AGE_TAXES_M = 20;
		final int MIN_AGE_TAXES_W = 18;
		final int MAX_AGE_TAXES_W = 35;
		
		String genre, textTaxes;
		int age;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est votre genre ? (h/f)");
		genre = clavier.next();
		
		System.out.println("Saisissez votre âge : ");
		age = clavier.nextInt();
		
		boolean womanLiableForTaxes = genre.equals("f") && age >= MIN_AGE_TAXES_W
				&& age <= MAX_AGE_TAXES_W;
		boolean ManLiableForTaxes =  genre.equals("h") && age > MIN_AGE_TAXES_M;
		
		textTaxes = (womanLiableForTaxes || ManLiableForTaxes) ? 
				"Vous êtes imposable." : "Vous n'êtes pas imposable.";
		
		System.out.println(textTaxes);

	}

}
