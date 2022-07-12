package POM_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{
	@FindBy (id = "pin") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continuebutton;
	
	public Pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pinbox(String Pin)
	{
		pin.sendKeys(Pin);
	}
	
	public void contButton()
	{
		continuebutton.click();
	}
	
	

}
