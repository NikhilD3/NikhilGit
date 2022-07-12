package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertStudy {
  @Test
  public void mymethod() 
  {
	  String a="nikhil1";
	  String b="nikhil";
	  
//	  Assert.assertEquals(a, b, "a and b values are not matching TC is failed");
//	  Reporter.log("a and b values are matching TC is passed", true);
	  
	  Assert.assertNotEquals(a, b, "a and b values are matching TC is failed");
	  Reporter.log("a and b values are not matching TC is passed",true);
	  
	  
  }
}
