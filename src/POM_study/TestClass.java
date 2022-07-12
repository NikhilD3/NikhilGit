package POM_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\Kitetest1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String usName = mysheet.getRow(1).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(2).getCell(0).getStringCellValue();
		String Pin = mysheet.getRow(3).getCell(0).getStringCellValue();
		
		
		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); //implicit wait
		
		Login_page login = new Login_page(driver);
		login.UName(usName);
		login.pass(pwd);
		login.logbutton();
		
		Thread.sleep(5000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Pin_page pin = new Pin_page(driver);
		pin.pinbox(Pin);
		pin.contButton();
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		WebElement UN = driver.findElement(By.xpath("//span[text()='Dhananjay']"));
		wait.until(ExpectedConditions.visibilityOf(UN));
		
		Home_page home = new Home_page(driver);
		home.NameValidation();
		home.clickonUserID();
		home.LogotClick();
		
		Thread.sleep(5000);
		

	}

	
}
