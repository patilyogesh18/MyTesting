package interface_study;

public class IC implements MyInterface{

	public static void main(String[] args) 
	{
	IC ic=new IC();
	ic.test();
	ic.test1();	
	ic.test2();
	ic.demo();
	
	}
	public void demo()
	{
		System.out.println("Own method of implementation class");
	}

	@Override
	public void test() 
	{
		System.out.println("Test method Completed in implementation class ");	
	}

	@Override
	public void test1() 
	{
		System.out.println("Test1 method Completed in implementation class ");
	}

	@Override
	public void test2() 
	{
		System.out.println("Test2 method Completed in implementation class ");		
	}

}
