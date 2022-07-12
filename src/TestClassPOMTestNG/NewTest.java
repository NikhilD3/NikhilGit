package TestClassPOMTestNG;

import org.testng.annotations.Test;

import BasePOMTestNG.Base;
import BasePOMTestNG.HomePage;
import BasePOMTestNG.KiteLoginPage;
import BasePOMTestNG.KitePinPage;
import UtilityPOMTestNG.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest extends Base {
	
	WebDriver driver;
	
	KiteLoginPage login;
	KitePinPage Pin;
	HomePage home;
	String key;
	
  @Test
  public void ValidateUserName() throws IOException 
  {
	  
	  Assert.assertEquals(home.getusername(), home.expctedName(), "Actual and Expected are not matching TC is failed");
	  
	  int TCID=1234;
	  Utility.captureScreenshot(driver, TCID);
	
  }
  @BeforeMethod
  public void LoginTokiteApp() throws EncryptedDocumentException, IOException 
  {
	  login.sendUser(Utility.datareadingfromproperties("UN"));
	  Reporter.log("sending userID", true);
	  login.sendpass(Utility.datareadingfromproperties("pass"));
	  Reporter.log("sending password", true);
	  login.clicklogin();
	  Reporter.log("login click", true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Pin.sendPin(Utility.datareadingfromproperties("Pin"));
	  Pin.clickContinue();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }

  @AfterMethod
  public void afterMethod() 
  {
	  home.clickonUserID();
	  home.LogotClick();
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  openBrowser();
	  login = new KiteLoginPage(driver);
	  Pin =new KitePinPage(driver);
	  home = new HomePage(driver);
			  
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
