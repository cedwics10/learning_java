package vehicule;

public class Voiture extends Vehicule {
	private int nombrePortes;
	
	public Voiture()
	{
		
	}
	
	public Voiture(String marque, String modele, int anneeFabrication,
			int nombrePortes) {
			super(marque, modele, anneeFabrication);
			this.nombrePortes = nombrePortes;
	}
	
	public int getNombrePortes()
	{
		return this.nombrePortes;
	}
	
	public void setNomrePortes(int nombrePortes)
	{
		this.nombrePortes = nombrePortes;
	}
	
	@Override
	public void afficherDetailsVehicule()
	{
		super.afficherDetailsVehicule();
		System.out.println("Nombre de portes : " + this.nombrePortes);
	}
}
