package methods;

public class Example9 {

	public static void main(String[] args) 
	{
		Example9 A=new Example9(); // Object Creation
		addition(); // Calling Non-Static Method
		A.studentinfo();// calling non static method
		A.studentinfo();// calling method without parameter
		A.studentinfo("Pune", 11, 'B', 33.3f);// calling method with parameter
		A.studentinfo("MH", 12,'A',999.99f);
		A.studentinfo("Katraj", 8, 'C', 11.11f);
		addition1(100, 200,11);
		addition1(400, 300,11);
		addition1(500, 500,10);
		addition1(10, 20, 30);
		
	}

	public static void addition() // Method without Parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("ADDITION IS "+sum);
		
	}
	
	public static void addition1(int a,int b,int c)
	{
		int sum=a+b+c;
		
		System.out.println("SUM IS "+sum);
	}
	
	public void studentinfo() // Non Parameterised Method
	
	{
		// Name, Weight, Grade, Roll_Num
		
	// String name= "Velocity"; 1/2
	// Name="Velocity"; // Step 2. Variable Initialization
		
		String name= "Velocity"; //1,2
		int RollNum=10;
		char grade='A';
		float weight=77.77f;
		
		
		System.out.println("==============================");
		System.out.println("STUDENT NAME IS "+name);
		System.out.println("STUDENT ROLL NUM IS "+RollNum);
		System.out.println("STUDENT GRADE IS "+grade);
		System.out.println("STUDENT WEIGHT IS "+weight);
		System.out.println("==============================");
		
	}
	
	
	public void studentinfo(String name,int RollNum,char Grade,float weight)
	{
		
		// Method with Parameter
		
		System.out.println("==============================");
		System.out.println("STUDENT NAME IS "+name);
		System.out.println("STUDENT ROLL NUM IS "+RollNum);
		System.out.println("STUDENT GRADE IS "+Grade);
		System.out.println("STUDENT WEIGHT IS "+weight);
		System.out.println("==============================");
			
	}
}
