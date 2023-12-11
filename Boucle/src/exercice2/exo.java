package exercice2;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre");
		
		int nombre = scanner.nextInt();
		
		for(int i = nombre + 1; i <= nombre + 10; i++)
		{
			System.out.println(i);
		}
		

	}

}
