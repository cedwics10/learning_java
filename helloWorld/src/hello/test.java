package hello;

public class test {
	public static void main(String[] args) {
		int numberHello;
		numberHello = -1;

		String stringHello = "", stringHelloNumber;
		stringHello = stringHello.trim();

		boolean isStringNotEmpty = !stringHello.isEmpty();
		boolean isHelloNumberPositive = numberHello >= 0;
		boolean HelloNumberNotExists = false;

		if (HelloNumberNotExists) {
			System.out.print("No hello number value.");
			System.exit(0);
		}

		stringHelloNumber = "Number : " + numberHello;

		if (isStringNotEmpty)
			System.out.print(stringHello);
		else if (isHelloNumberPositive)
			System.out.print("Le texte spécifié est vide. " + stringHelloNumber);
		else
			System.out.print("Le texte spécifié est vide. Pas de nombre.");
	}
	
	public String helloWorldMessage()
	{
		return "";
	}

}
