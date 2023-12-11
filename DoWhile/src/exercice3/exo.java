package exercice3;

import java.util.Scanner;


public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double plusGrandNombre = Double.NEGATIVE_INFINITY;
		int nombreUtilisateur;
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Entrez un nombre, entrea 0 pour arrêter.");
			nombreUtilisateur = scanner.nextInt();
			
			if(nombreUtilisateur != 0 && nombreUtilisateur > plusGrandNombre)
				plusGrandNombre = nombreUtilisateur;

		} while (nombreUtilisateur != 0);

		System.out.println("Le plus gran dnombre était : " + (int) plusGrandNombre);
	}

}
