package testNGInAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullStudy {
	
	// This method is use to verify components or text fields empty or not if it is empty 
	// output is pass otherwise fail.

  @Test
  public void TC5() 
  {
	  String a ="";
	  
	  Assert.assertNull(a, "a is not null");
	  System.out.println("Hi all how are you");
	  
  }
}
