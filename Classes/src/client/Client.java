package client;

public class Client {
	static int nombreInstances = 1;

	private int id;
	private String nom;
	private String prenom;
	private String ville;
	private String email;

	public Client() {
		this.id = Client.nombreInstances;
		Client.nombreInstances++;
	}

	public Client(String nom, String prenom, String ville, String email) {
		this.id = Client.nombreInstances;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.email = email;

		Client.nombreInstances++;

	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "--- Fiche client [#" + this.id + "] \n" + "> Nom : " + this.nom + "\n" + "> Prénom : " + this.prenom
				+ "\n" + "> Ville : " + this.ville + "\n" + "> Email : " + this.email;
	}

}
