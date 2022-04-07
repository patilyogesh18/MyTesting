package interface_study;

public class Final_KeywordUse {
	
	int a=10; // Global variable
	final int b=40;

	public static void main(String[] args) 
	{
		Final_KeywordUse f=new Final_KeywordUse();
		f.add();
		
	}
	public void add()
	{
		a=a+20;
		System.out.println("Updated value of a is "+a);
		//b=b+20; // In final variable we Can't update value
	}
}
