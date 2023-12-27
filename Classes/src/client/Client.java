package client;

public class Client {
	static int nombreInstances = 1;

	private int id;
	private String nom;
	private String prenom;
	private String ville;
	private int age;

	public Client() {
		this.id = Client.nombreInstances;
		Client.nombreInstances++;
	}

	public Client(String nom, String prenom, String ville, int age) {
		this.id = Client.nombreInstances;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.age = age;

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

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "--- Fiche client [#" + this.id + "] \n" + "> Nom : " + this.nom + "\n" + "> Prénom : " + this.prenom
				+ "\n" + "> Ville : " + this.ville + "\n" + "> Âge : " + this.age;
	}

}
