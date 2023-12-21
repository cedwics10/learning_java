package vehicule;

public class Vehicule {
	private String marque;
	private String modele;
	private int anneeFabrication;

	public Vehicule(String marque, String modele, int anneeFabrication) {
		this.setMarque(marque);
		this.setModele(modele);
		this.setAnneeFabrication(anneeFabrication);
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnneeFabrication() {
		return this.anneeFabrication;
	}

	public void setAnneeFabrication(int anneeFabrication) {
		this.anneeFabrication = anneeFabrication;
	}
	
	public void afficherDetailsVehicule()
	{
		System.out.println("-----------------");
		System.out.println("Les détails du véhicules osnt les suivants :");
		System.out.println("Marque : " + this.marque);
		System.out.println("Modèle : " + this.modele);		
		System.out.println("Année de fabrication : " + this.anneeFabrication);	
		System.out.println("-----------------");
	}

}
