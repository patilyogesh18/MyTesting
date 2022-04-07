package Abstract;

public abstract class Sample {

	public static void main(String[] args) 
	{
		//Sample s=new Sample(); // We can't create object of abstract class
		test4();
	}
	public void test1()
	{
		System.out.println("This is complete method");
		
	}
	public void test2()
	{
		// Method have body
		// Even if body is empty,this is complete method 
	}
	
	public abstract void test3(); // This is incomplete method called as abstract method
	
	public static void test4() 
	{
	System.out.println("This is static method with body");	
	}
	public abstract void test6(); // This is incomplete method called as abstract method
	public abstract void test7();
	
}
