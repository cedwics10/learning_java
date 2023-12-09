package exercice13;

import java.util.Scanner;

public class exo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heure, min;
		String finalHour, finalMinute, stringResult;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Choisissez l'heure : ");
		heure = clavier.nextInt();

		System.out.println("Saisissez les minutes : ");
		min = clavier.nextInt();
		
		boolean nextHourByAMinute = (min + 1 == 60);
		
		// we force "next minute" time to be correct
		heure = (nextHourByAMinute ? heure + 1 : heure) % 24;
		min = (min + 1) % 60;
		
		finalHour = String.format("%02d", heure);
		finalMinute = String.format("%02d", min);

		
		System.out.print("Dans une minute, il sera : " + finalHour + ":" + finalMinute);
	}

}
