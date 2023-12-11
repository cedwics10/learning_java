package exercice10;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plusGrand = 0;
		int positionPlusGrand = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.println("Saisissez un nombre");
			int nombre = scanner.nextInt();

			if (nombre > plusGrand) {
				plusGrand = nombre;
				positionPlusGrand = i;
			}
			System.out.println("Nombre #" + i + " = " + nombre);
		}

		System.out.println("Le nombre le plus grand est : " + plusGrand + " en position " + positionPlusGrand);
	}

}
