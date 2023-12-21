package banque;

public class CarteBleue {

	private static int nombreCartes = 1;

	private int id;
	private String numero;
	private int a_exp;
	private int id_compte;

	CarteBleue() {
		this.id = CarteBleue.nombreCartes;

		CarteBleue.nombreCartes++;
	}

	CarteBleue(int id, String numero, int a_exp, int id_compte) {
		this();

		this.setNumero(numero);
		this.setIdCompte(id_compte);
		this.setIdCompte(id_compte);
	}

	public int getId() {
		return this.id;

	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getAExp() {
		return this.a_exp;
	}

	public void setAExp(int a_exp) {
		this.a_exp = a_exp;
	}

	public int getIdCompte() {
		return this.id_compte;
	}

	public void setIdCompte(int id_compte) {
		this.id_compte = id_compte;
	}

	public String toString() {
		return "";
	}

}
