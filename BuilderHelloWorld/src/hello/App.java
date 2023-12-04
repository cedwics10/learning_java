package hello;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldBuilder myBuilder = new HelloWorldBuilder()
				.setName("Gérard")
				.setAge(40);
		
		HelloWorld myHello = myBuilder.makeObject();
		System.out.print(myHello.generateHelloMessage());
	}

}
