package testNGInAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
	
	// Use to verify components or text fields empty or not, if it is not empty output is pass 
	// otherwise fail.

  @Test
  public void TC6() 
  {
  String a=null;
	  
	  Assert.assertNotNull(a, "a is null");
	   
  }
}
