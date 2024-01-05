package banque;

public class Compte {
	private static int compteur = 1;
	private int id;
	private String rib;
	private double solde;
	private int client_id;

	Compte(String rib, double solde, int id_compte) {
		
		this.id = Compte.compteur;
		this.rib = rib;
		this.solde = solde;
		this.client_id = id_compte;
		
		Compte.compteur++;
	}

	public int getId() {
		return this.id;
	}

	public String getRib() {
		return this.rib;
	}

	public void setRib(String Rib) {
		this.rib = Rib;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getClientId() {
		return this.client_id;
	}

	public void setClientId(int id_compte) {
		this.client_id = id_compte;
	}


	public String toString()
	{
		return "   * Compte [#" + this.id + "]"
		+ "\n    - RIB :" + this.rib + " "
		+ "\n    - Solde : " + this.solde
		+ "\n    - Numéro compte client : " + this.client_id; 
		
	}

}
