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

public class KiteValidanteUserID2 extends Base
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
	  login.sendUser(Utility.readDatafromExcel(0, 0));
	  login.sendpass(Utility.readDatafromExcel(1, 0));
	  login.clicklogin();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Pin.sendPin(Utility.readDatafromExcel(2, 0));
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
