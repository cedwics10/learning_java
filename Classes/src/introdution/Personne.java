package introdution;

public class Personne {

	public String prenom;
	public String ville;
	public int age;
	
	public Personne() {
		this.prenom = "BILL";
		this.ville = "Verneuillet mais j'ai aussi" 
		+ "un grand palace  à PAUL GUINOT." ;
		this.age = 22;
	}
	
	public Personne(String prenom,
			String ville, int age)
	{
		this.prenom = prenom;
		this.ville = ville;
		this.age = age;
	}
	
	public String toString()
	{
		return "Je m'appelle " + this.prenom + "\n"
				+ ", j'ai : " + this.age + "\n"
				+ " et j'habite à :" 
				+   "\n " + this.ville;
	}
}
