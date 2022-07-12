package KiteExcelPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		File myfile = new File("C:\\Users\\Nikil\\eclipse-workspace\\KiteTest.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String UN = mysheet.getRow(2).getCell(0).getStringCellValue();
		String PassW = mysheet.getRow(3).getCell(0).getStringCellValue();
		
		
		
		
		LoginPage login = new LoginPage(driver);
		login.sendName(UN);
		login.sendPassword(PassW);
		login.ClickLoginButton();

	}

}
