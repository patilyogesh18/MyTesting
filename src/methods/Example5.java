package methods;

public class Example5 {

	public static void main(String[] args) 
	{
		System.out.println("THIS IS MAIN METHOD");
		sampleDemo();
		sampleDemo();
		Example5 e5=new Example5(); 
		// OBJECT OF NON STATIC METHOD
		e5.display();
		System.out.println(e5);
		Example3.test3();
		Example3 e3=new Example3();
		e3.test4();

	}
		public static void sampleDemo() {
			System.out.println("THIS IS SAMPLE DEMO");
			
		}
		
		 void display() {
			System.out.println("DISPLAY METHOD");
		}
}	
