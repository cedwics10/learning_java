package banque;

import java.util.ArrayList;

public class Client {
	private int id;
	private String prenom;
	private String nom;
	private String ville;
	private int age;
	
	private ArrayList<Compte> comptes;
	
	Client(String nom, String prenom, String ville, int age)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.ville = ville;
		this.age = age;
		
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public Client setPrenom(String prenom)
	{
		this.prenom = prenom;
		return this;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public Client setNom(String nom)
	{
		this.nom = nom;
		return this;
	}
	
	public String getVille()
	{
		return this.ville;
	}
	
	public Client setVille(String ville)
	{
		this.ville = ville;
		return this;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public Client setAge(int age)
	{
		this.age = age;
		return this;
	}
	
	public ArrayList<Compte> getCompte()
	{
		return this.comptes;
	}
	
	public void addAccount(Compte compte)
	{
		this.comptes.add(compte);
	}
	
	public String toString()
	{
		return "prenom : " + prenom  + ","
				+ ", nom : " + nom
				+ ", ville : " + ville
				+ ", age  : " + age;
	}

	
}
