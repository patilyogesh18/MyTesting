package Abstract;

public class Concrete extends Sample{

	public static void main(String[] args) 
	{
		// You can create object of concrete class
		
		Concrete c=new Concrete();
		c.test1();
		c.test2();
		c.test3();
		c.test5();
		c.test6();
		c.test7();
		

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	public void test5()
	{
		System.out.println("this is concrete method");
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test7() {
		// TODO Auto-generated method stub
		
	}
	
	

}
