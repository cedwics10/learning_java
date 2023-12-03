package goodluck;

public class test {
	public static void main(String[] args) {
		String hello = "    ";
		hello = hello.trim();
		
		boolean textNotEmpty = !hello.isEmpty();
		if (textNotEmpty)
			System.out.print(hello);
		else {
			System.out.print("Il faut �crire du texte, sinon" 
		+ " je ne suis pas content l'ami.");
		}
	}

}
