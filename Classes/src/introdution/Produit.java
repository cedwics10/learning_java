package introdution;

public class Produit {
	private int id;
	private String nom;
	private float prix;
	private int quantiteStock;

	public Produit() {

	}

	public Produit(String nom, float prix, int quantite) {
		this.id = 1;
		this.setNom(nom);
		this.setPrix(prix);
		this.setQuantiteStock(quantite);

	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		if (nom.isEmpty())
			this.nom = "Inconnu";
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		if (prix >= 0)
			this.prix = prix;
	}

	public int getQuantiteStock() {
		return this.quantiteStock;
	}

	public void setQuantiteStock(int quantite) {
		if (quantite >= 0)
			this.quantiteStock = quantite;
	}

	public String toString() {
		String s = "";
		if (this.quantiteStock > 1)
			s = "s";
		return "--------------------" + "Détails du produit : " + this.nom + "\n" + "Prix : " + this.prix + "€\n"
				+ "Quantite : plus que " + this.quantiteStock + " exemplaire" + s + " !!!!!\n";
	}
}
