package POM_study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	@FindBy (xpath = "//span[text()='Dhananjay']") private WebElement actualText;
	@FindBy (xpath = "//span[text()='ELR321']") private WebElement UserID;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logout;
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NameValidation ()
	{
		String expctedText = "Dhananjay";
		String userN = actualText.getText();
		
		System.out.println(userN);
		
		if(expctedText.equals(userN))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
		
		
	}
	
	public void clickonUserID()
	{
		UserID.click();
	}
	
	public void LogotClick()
	{
		logout.click();
	}

}
