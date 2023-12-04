package hello;

public class HelloWorldBuilder {
	
	private String name;
	private int id;
	
	HelloWorldBuilder ()
	{
		 System.out.print(this.id);
	}
	
	HelloWorldBuilder setName(String Name)
	{
		this.name = Name;
		return this;
	}
	
	HelloWorldBuilder setId(int Id)
	{
		this.id = Id;
		return this;
	}

	HelloWorld makeClass()
	{
		if(this.name != null && this.id != 0)
			return new HelloWorld(this.name, this.id);
		else
			return new HelloWorld(this.name);
	}
}
