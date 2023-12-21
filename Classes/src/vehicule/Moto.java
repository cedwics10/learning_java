package vehicule;

public class Moto extends Vehicule {
	private String typeMoto;
	
	public Moto()
	{
		
	}
	
	public Moto(String marque, String modele, int anneeFabrication,
			String typeMoto) {
			super(marque, modele, anneeFabrication);
			this.typeMoto = typeMoto;
	}
	
	public String getTypeMoto()
	{
		return this.typeMoto;
	}
	
	public void setNomrePortes(String typeMoto)
	{
		this.typeMoto = typeMoto;
	}
	
	@Override
	public void afficherDetailsVehicule()
	{
		super.afficherDetailsVehicule();
		System.out.println("Type de moto : " + this.typeMoto);
	}
}
