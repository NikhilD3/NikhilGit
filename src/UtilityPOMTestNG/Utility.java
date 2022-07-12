package UtilityPOMTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	//excel test data
	//take screenshot
	//close browser
	
	public static String datareadingfromproperties(String key) throws IOException
	{
		Properties obj = new Properties();
		FileInputStream ojbfile = new FileInputStream("C:\\Users\\Nikil\\eclipse-workspace\\Selenium_study\\properties.properties");
			obj.load(ojbfile);	
			String keys = obj.getProperty(key);
			return keys;
			
	}
	
	public static String readDatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("C:\\Users\\Nikil\\eclipse-workspace\\KiteTest3.xlsx");
	
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	

	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException 
	{
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Selenium Screenshots\\TestCaseID"+TCID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
	}
}
