package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage
{
	//1.data members
	
	
	@FindBy (id = "pin") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continuebutton;
	
	//2.Constructor
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.usage
	
	public void sendPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickContinue()
	{
		continuebutton.click();
	}

	

	
}
