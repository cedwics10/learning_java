package hello;

public class HelloWorldBuilder {
	
	private String name;
	private int age;
	
	HelloWorldBuilder()
	{
		//  System.out.print("" + this.id);
	}
	
	HelloWorldBuilder setName(String Name)
	{
		this.name = Name;
		return this;
	}
	
	HelloWorldBuilder setAge(int age)
	{
		this.age = age;
		return this;
	}

	HelloWorld makeClass()
	{
		if(this.name != null && this.age != 0)
			return new HelloWorld(this.name, this.age);
		else
			return new HelloWorld(this.name);
	}
}
