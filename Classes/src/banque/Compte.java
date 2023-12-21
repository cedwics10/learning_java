package banque;

public class Compte {
	private static int id = 1;
	private String numero;
	private int a_exp;
	private int id_compte;
	
	Compte(String numero, int a_exp, int id_compte)
	{
		
	}
	
	public int getId()
	{
		return Compte.id;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public Compte setNumero(String numero)
	{
		this.numero = numero;
		return this;
	}
	
}
