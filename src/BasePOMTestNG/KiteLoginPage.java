package BasePOMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//1.data members
	
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2.constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.usage
	
	public void sendUser(String UN)
	{
		userName.sendKeys(UN);
	}
	
	public void sendpass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		LoginButton.click();
	}

}
