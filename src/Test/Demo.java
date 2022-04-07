package Test;

import access_specifier.AS1;

public class Demo extends AS1{

	public static void main(String[] args) 
	{
		AS1 S1=new AS1(); // Created object if AS1 class
		S1.test1(); // Calling public method from AS1

		
		Demo d1=new Demo();
		d1.test1(); // Calling public method of AS1 class
		d1.test3(); // Calling protected method of AS1 class
		// d1.test2(); // Can't call default access specifier
		// d1.test4(); // Can't call private access specifier
		
		
	}

}
