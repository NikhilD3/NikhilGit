package Listeners_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_study.listener.class)
public class Mytest2 {
  @Test
  public void mymethod4() 
  {
	  Reporter.log("TC4 Running",true);
  }
  
  @Test(dependsOnMethods = "mymethod6")
  public void mymethod5() 
  {
	  Reporter.log("TC5 Running",true);
  } 
  
  @Test
  public void mymethod6() 
  {
	  Assert.fail();
	  Reporter.log("TC6 Running",true);
  }
}
