package testNGInAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
	
	// Use to verify conditions are true or false, if condition is true output is fail and if 
	// condition is false then output is pass.

  @Test()
  public void TC4() 
  {
	  boolean result=false;
	  Assert.assertFalse(result,"Result is true ");
  }
}
