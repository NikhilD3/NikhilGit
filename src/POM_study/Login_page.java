package POM_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	//1. data members
	
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2. constructor
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.method
	
	public void UName(String usName)
	{
		userName.sendKeys(usName);
	}
	
	public void pass(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void logbutton()
	{
		LoginButton.click();
	}

	
}
