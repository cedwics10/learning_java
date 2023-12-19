package introdution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit tv = new Produit("TV",300, 50);
		Produit pc = new Produit("PC",1000, 100);
		Produit aspirateur = new Produit("Aspirateur", 200, 100);
		Produit inconnu = new Produit("", -200, -100);
		Produit palakot = new Produit("GEORGES IGOR PALAKOT", 10, 1);
				
		System.out.println("Le pc a pour prix :" + pc.getPrix());
		
		tv.setPrix(2000);
		pc.setNom("PC gamer");
		aspirateur.setQuantiteStock(100);
		
		System.out.println("La télé pour pour stock : " + tv.getQuantiteStock());
		System.out.println(tv);
		System.out.println(pc);
		System.out.println(aspirateur);
		System.out.println(inconnu);
		
		
	}

}
