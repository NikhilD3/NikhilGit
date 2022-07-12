package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNulluse {
  @Test
  public void mymethod() 
  {
	  String a=null;
	  String b="pathardi";
	  
	  Assert.assertNull(a,"TC is failed value is not null");
	  Reporter.log("TC is passed value is null", true);
	  
	  Assert.assertNotNull(b,"TC is failed value is null");
	  Reporter.log("TC is passed value is not null", true);
  }
}
