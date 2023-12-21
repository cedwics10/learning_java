package vehicule;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicule> garage = new ArrayList<>();
		Vehicule vehicule1 = new Vehicule("Citroën", "C4", 2003);
		
		System.out.println("Anne de favrication du véhicule 1 : " + vehicule1.getAnneeFabrication());
		
		Voiture voiture1 = new Voiture("Ford", "Mustang", 2008, 4);
		
		System.out.println("Modèle de la voiture 1 : " + voiture1.getMarque());
		
		Voiture voiture2 = new Voiture("Renault", "Clio", 2001, 4);
		
		System.out.println("Nombre de portes de la voiture 2 : " + voiture2.getNombrePortes());

		Moto moto1 = new Moto("MOTO 1", "MODELE 1", 
				2017, "Standard");
		
		System.out.println("Type de moto 1 : " + moto1.getTypeMoto());

		Moto moto2 = new Moto("MOTO 2", "MODELE 2", 
				2017, "Premium");
		
		System.out.println("Année de fabrication de la moto 2 : " + moto1.getAnneeFabrication());

		garage.add(vehicule1);
		garage.add(voiture1);
		garage.add(voiture2);
		garage.add(moto1);
		garage.add(moto2);
		
		for(Vehicule becane : garage)
		{
			becane.afficherDetailsVehicule();
		}
		
		System.out.println("Bonjour");
		
	}

}
