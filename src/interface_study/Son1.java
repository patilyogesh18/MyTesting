package interface_study;

public class Son1  implements father1,Mother1{

	public static void main(String[] args) 
	{
	Son1 s=new Son1();
	s.money();
	s.rules(); // calling default method from father1 
	//  father1.rules(); // static calling from interface father1
	}

	@Override
	public void money() {
		
		Mother1.super.money();
		father1.super.money();
		// Mother1.super.rules();
	}

	@Override
	public void rules() {
	
		father1.super.rules();
		Mother1.super.rules();
	}
	

}
