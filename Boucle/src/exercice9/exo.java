package exercice9;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plusGrand = 0,nombre;
		Scanner scanner = new Scanner(System.in);

		for(int i = 1; i <= 20; i++)
		{
			System.out.println("Saisissez un nombre");
			nombre = scanner.nextInt();
			
			if(nombre > plusGrand)
				plusGrand = nombre;
			System.out.println("Nombre #" +  i + " = " +  nombre);
		}
		
		System.out.println("Le nombre le plus grand est : " + plusGrand);
	}

}
