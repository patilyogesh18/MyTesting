package testNGInAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueStudy {
	
	// This method is use to verify conditions are true or false. If condition is true output is 
	// pass otherwise fail.

  @Test
  public void TC3() 
  {
	  boolean result=true;
	  Assert.assertTrue(result,"Result is False");
	  Reporter.log("TC3 is Passed",true);
	  
  }
  
}
