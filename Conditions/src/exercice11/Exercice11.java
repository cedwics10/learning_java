package exercice11;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberDay;
		String stringDay;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Choisissez le numéro de la semaine : ");
		numberDay = clavier.nextInt();
		
		if (numberDay == 1)
			stringDay = "Lundi";
		else if (numberDay == 2)
			stringDay = "Mardi";
		else if (numberDay == 3)
			stringDay = "Mercredi";
		else if (numberDay == 4)
			stringDay = "Jeudi";
		else if (numberDay == 5)
			stringDay = "Vendredi";
		else if (numberDay == 6)
			stringDay = "Samedi";
		else if(numberDay == 7)
			stringDay = "Dimanche";
		else
			stringDay = "Numéro invalide";
		System.out.print("Le jour de la semaine correspondant au numéro est : " + stringDay);
	}

}
