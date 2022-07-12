package TestClassPOMTestNG;

import org.testng.annotations.Test;

import BasePackage.Base;
import KitePOM.HomePage;
import KitePOM.KiteLoginPage;
import KitePOM.KitePinPage;
import UtilityPOMTestNG.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class KiteValidanteUserID extends Base
{
	KiteLoginPage login;
	KitePinPage Pin;
	HomePage home;
	
  @Test
  public void ValidateUserID() throws IOException
  
  {
	  Assert.assertEquals(home.getusername(),Utility.datareadingfromproperties("UN") );
  }
  @BeforeMethod
  public void LogintoKite() throws IOException 
  {
	  login.sendUser(Utility.datareadingfromproperties("UN"));
	  login.sendpass(Utility.datareadingfromproperties("pass"));
	  login.clicklogin();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Pin.sendPin(Utility.datareadingfromproperties("Pin"));
	  Pin.clickContinue();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }

  @AfterMethod
  public void LogoutfromKite() 
  {
	  home.LogotClick();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  openBrowser();
	  login = new KiteLoginPage(driver);
	  Pin = new KitePinPage(driver);
	  home = new HomePage(driver);
	  
  }

  @AfterClass
  public void CloseBrowser() 
  {
	 driver.close(); 
  }

}
