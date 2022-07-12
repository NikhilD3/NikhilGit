package Keywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  
@Test (priority = 1)
  public void myMethod()
  {
	  Reporter.log("hi my name is Nikhil", true);
  }
  
  @Test (priority = 2)
  public void myMethod3()
  {
	  Reporter.log("hi my name is Nikhil", true);
  }
  @Test (dependsOnMethods = "myMethod")
  public void myMethod2()
  {
	  Reporter.log("hi my name is Nikhil", true);
  }
  
}
