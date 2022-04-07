package polymorphism;

public class Son extends Father {

	public static void main(String[] args) 
	{
		Father f=new Father(); // Super class object
		Son s=new Son(); // Sub class object
			f.money();
			s.money();
		
	}
	// Overriding super class method
	public void money()
	{
		System.out.println("Son's money 12K");
	}
}
