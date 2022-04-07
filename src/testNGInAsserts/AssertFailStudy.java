package testNGInAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
	
	// This method is used to intentionally failed the test method.
  @Test
  public void TC7() 
  {
	  String a="Pune";
	  String b=null;
	
	  Assert.assertNotNull(a,"a is null");
	  System.out.println("a is not Null");
	  Assert.assertNull(b,"b is not null");
	  System.out.println("b is  Null");
	  Assert.fail();
	  
  }
}
