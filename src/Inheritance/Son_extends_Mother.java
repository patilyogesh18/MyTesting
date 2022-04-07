package Inheritance;

public class Son_extends_Mother 
{

	public static void main(String[] args)
	{
		Son_extends_Mother s= new Son_extends_Mother();
		s.laptop();
		s.look();   // calling super class property using sub class object
		s.money();  // calling super class property using sub class object
		nature();   // calling super class static property in sub class

	}
	
	public static void nature()
	{
		System.out.println("Mother natute");
	}

	public void money()
	{
		System.out.println("money");
	}

	public void look()
	{
		System.out.println("look");
	}

	public void laptop()
	{
		System.out.println("Sons laptop");
	}
	
}

