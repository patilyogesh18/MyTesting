package testNGInAsserts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
	
	// Used to verify expected and actual results. If both results are same then output is pass 
	// otherwise fail.

  @Test
  public void TC1() 
  {
	  String name="VCTC";
	  String name1="VCTC";
	  
//	  if(name.equals(name1))
//	  {
//		  System.out.println("TC is Paseed");
//	  }
//	  else
//	  {
//		  System.out.println("Tc is Failed");
//	  }
	  
	  Assert.assertEquals(name, name1,"String is Matching");
	  Reporter.log("TC1 is Passed",true);
  }
}
