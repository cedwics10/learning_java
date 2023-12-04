package hello;

public class test {

	public static void main(String[] args) {
		HelloWorldBuilder myBuilder = new HelloWorldBuilder().
				setId(10).setName("Mickey");
		
		HelloWorld myHelloWorld = myBuilder.makeClass();
		myHelloWorld.checkNumberExists();
		System.out.print(myHelloWorld.printHelloMessage());
	} 
}
