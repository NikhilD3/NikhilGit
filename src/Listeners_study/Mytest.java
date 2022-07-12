package Listeners_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_study.listener.class)
public class Mytest {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("TC1 Running",true);
  }
  
  @Test(dependsOnMethods = "mymethod3")
  public void mymethod2() 
  {
	  Reporter.log("TC3 Running",true);
  }
  
  @Test
  public void mymethod3() 
  {
	  Assert.fail();
	  Reporter.log("TC3 Running",true);
  }
}
