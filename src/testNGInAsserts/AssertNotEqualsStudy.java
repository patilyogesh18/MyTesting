package testNGInAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqualsStudy {
 
	// Used to verify expected and actual results. If both results are not same then output is 
	// pass otherwise fail.

	@Test
  public void TC2() 
  {
	  String name="VCTC";
	  String name1="VCTC1";
	  
	  Assert.assertNotEquals(name, name1,"String are Matching");
	  Reporter.log("TC2 is running",true);
  }
}
