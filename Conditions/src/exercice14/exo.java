package exercice14;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombrePhotocopies;
		double prixPhotocopies;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est le nombre de photocopies effectuées ? ");
		nombrePhotocopies = clavier.nextInt();
		
		
		if(nombrePhotocopies < 10)
			prixPhotocopies = nombrePhotocopies * 0.1;
		else if(nombrePhotocopies < 10 + 20)
			prixPhotocopies  = 10 * 0.1 + (nombrePhotocopies - 10) * 0.09;
		else
			prixPhotocopies  = 10 * 0.1 + 20 * 0.09 +  (nombrePhotocopies - 30) * 0.08;
		
		prixPhotocopies = Math.round(prixPhotocopies * 100.0) / 100.0; // round with 2 decimals
		System.out.print("Le prix total des photocopies est de : " + prixPhotocopies);
			
	}

}
