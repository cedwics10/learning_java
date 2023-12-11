package exercice9;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double plusGrand = Double.NEGATIVE_INFINITY;
		Scanner scanner = new Scanner(System.in);

		for(int i = 1; i <= 20; i++)
		{
			System.out.println("Saisissez un nombre");
			double nombre = scanner.nextDouble();
			
			if(nombre > plusGrand)
				plusGrand = nombre;
			System.out.println("Nombre #" +  i + " = " +  (int) nombre);
		}
		
		System.out.println("Le nombre le plus grand est : " + (int) plusGrand);
	}

}
