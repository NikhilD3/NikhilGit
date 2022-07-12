package TestClassPOMTestNG;

import org.testng.annotations.Test;

import BasePOMTestNG.Base;
import BasePOMTestNG.HomePage;
import BasePOMTestNG.KiteLoginPage;
import BasePOMTestNG.KitePinPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUserName {
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet mysheet;
	
	KiteLoginPage login;
	KitePinPage Pin;
	HomePage home;
	
  
  @BeforeClass
  public void beforeclass() throws EncryptedDocumentException, IOException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikil\\eclipse-workspace\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  Reporter.log("launching Browser",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  
	  File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\Kitetest1.xlsx");
	  mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	  
	  login=new KiteLoginPage(driver);
	  Pin=new KitePinPage(driver);
	  home=new HomePage(driver);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
	  String pwd = mysheet.getRow(2).getCell(0).getStringCellValue();
	  String pin = mysheet.getRow(3).getCell(0).getStringCellValue();
	  
	  login.sendUser(UN);
	  Reporter.log("sending username",true);
	  login.sendpass(pwd);
	  Reporter.log("sending password",true);
	  login.clicklogin();
	  Reporter.log("login click",true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Pin.sendPin(pin);
	  Reporter.log("sending pin",true);
	  Pin.clickContinue();
	  Reporter.log("click continue",true);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
  }

  @Test
  public void mymethod() 
  {
	  String expctedText = "Dhananjay";
	  String actualText = home.getusername();
	  Reporter.log("Validating UserName",true);
	  
	  Assert.assertEquals(actualText, expctedText, "actual and expcted are not matching TC failed");
	  Reporter.log("actual and expcted are matching TC passed", true);
	  
	  
  }

  @AfterMethod
  public void Aftermethod() 
  {
	  home.clickonUserID();
	  home.LogotClick();
	  Reporter.log("logging out...",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("closing browser...",true);
	  driver.close();
  }

}
