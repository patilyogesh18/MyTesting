package access_specifier;

public class AS1 {

	
	
		int a=10; // Default global variable
		public int b=20;  // Public global variable
		protected int c= 30; // protected global variable
		private int d= 40; // Private global variable
		
		public static void main(String[] args)
		
		{
			AS1 S1=new AS1();
			S1.test1(); // Public method --> Throughout project 
			S1.test2(); // Default method --> within package --> can't accessed outside of package
			S1.test3(); // Protected method --> within package --> can be accessed outside of package
			S1.test4(); // Private method --> only within class
			
		System.out.println("Default global variable a is "+S1.a);
		System.out.println("Public global variable b is "+S1.b);
		System.out.println("Protected global variable a is "+S1.c);	
		System.out.println("Private global variable a is "+S1.d);	
			
	
		}
		
		public void test1()
		{
			System.out.println("Public test1 method from AS1 class");
		}
		
		void test2()
		{
			System.out.println("Default test2 method from AS1 class");
		}
		
		protected void test3()
		{
			System.out.println("Protected test3 method from AS1 class");
		}
		
		private void test4()
		{
			System.out.println("Private test4 method from AS1 class");
		}
		
}
