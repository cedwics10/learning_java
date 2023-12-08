package exercice11;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberDay;
		String stringDay;

		Scanner clavier = new Scanner(System.in);
		numberDay = clavier.nextInt();
		if (numberDay == 1)
			stringDay = "Lundi";
		else if (numberDay == 2)
			stringDay = "Mardi";
		else if (numberDay == 3)
			stringDay = "Mecredi";
		if (numberDay == 1)
			stringDay = "Lundi";
		else if (numberDay == 2)
			stringDay = "Mardi";
		else if (numberDay == 3)
			stringDay = "Vendredi";
		else
			stringDay = "Dimanche"
		
		System.out.print("Le jour de la semaine est" + stringDay);
	}

}
