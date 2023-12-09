package exercice15;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour, minute, second;
		int nextHour, nextMinute, nextSecond;
		String finalHour, finalMinute, finalSecond;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Choisissez l'heure : ");
		hour = clavier.nextInt();

		System.out.println("Saisissez les minutes : ");
		minute = clavier.nextInt();

		System.out.println("Saisissez les secondes : ");
		second = clavier.nextInt();
		second++;
		
		boolean newMinuteByASecond = (second == 60);
		minute += newMinuteByASecond ? 1 : 0;
		
		boolean newHourByASecond = (minute == 60);
		hour += newHourByASecond ? 1 : 0;
		
		nextSecond = second % 60;
		nextMinute = minute % 60;
		nextHour = hour % 24;
		
		finalSecond = String.format("%02d", nextSecond);
		finalMinute = String.format("%02d", nextMinute);
		finalHour = String.format("%02d",  nextHour);
		
		
		System.out.print("Dans une seconde, il sera :" + finalHour + ":" + finalMinute + ":" + finalSecond);
	}

}
