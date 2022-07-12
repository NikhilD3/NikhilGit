package KiteExcelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (id = "userid") private WebElement Name;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void sendName(String UserName)
	{
		Name.sendKeys(UserName);
	}
	
	public void sendPassword(String Pass)
	{
		password.sendKeys(Pass);
	}
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}

}
