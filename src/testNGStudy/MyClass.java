package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void MyMethod1() 
  {
	  System.out.println("Hi Welcome to testNG");
  }
  @Test
  public void MyMethod2() 
  {
	  System.out.println("Hi Welcome to testNG");
  }
  @Test
  public void MyMethod3() 
  {
	  System.out.println("Hi Welcome to testNG");
  }
  @Test
  public void MyMethod4() 
  {
	  System.out.println("Hi Welcome to testNG");
	  Reporter.log("Hi Welcome to testNG",true);
  }
}
