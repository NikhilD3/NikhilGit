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

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\KiteTest.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String UN = mysheet.getRow(2).getCell(0).getStringCellValue();
		String pass = mysheet.getRow(3).getCell(0).getStringCellValue();
		String PIN = mysheet.getRow(4).getCell(0).getStringCellValue();
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement userID = driver.findElement(By.id("userid"));
		userID.sendKeys(UN);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pass);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("pin")).sendKeys(PIN);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		WebElement actualText = driver.findElement(By.xpath("//span[text()='ELR321']"));
		String actuText = actualText.getText();
		String expctedText = UN;
		
		if(actuText.equals(expctedText))
		{
			System.out.println("Text is match Test case is Pass");
		}
		else 
		{
			System.out.println("Text is mismatch Test case is fail");
		}
		
		driver.findElement(By.xpath("//span[text()='ELR321']")).click();
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		
		

	}

}
