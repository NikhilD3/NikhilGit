package ExcelSheetRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\FBTest.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String Email = mysheet.getRow(0).getCell(0).getStringCellValue();
		String Password = mysheet.getRow(1).getCell(0).getStringCellValue();
		String Name = mysheet.getRow(3).getCell(1).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement emailfield = driver.findElement(By.id("email"));
		WebElement Passwordfield = driver.findElement(By.id("pass"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		emailfield.sendKeys(Email);
		Passwordfield.sendKeys(Password);
		loginbutton.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Nikhill Deshmukh']")).click();
		
//		WebElement actualName = driver.findElement(By.xpath("//span[text()='Nikhill Deshmukh']"));
//		actualName.getText();
//		String expectedName = Name;
//		
//		if(actualName.equals(expectedName))
//		{
//			System.out.println("User Name is match Test Case is Passed");
//		}
//		else
//		{
//			System.out.println("User Name is not a match Test Case is Fail");
//		}
		
		
		

	}

}
