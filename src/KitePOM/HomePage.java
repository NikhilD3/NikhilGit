package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath = "//span[text()='Dhananjay']") private WebElement actualText;
	@FindBy (xpath = "//span[text()='ELR321']") private WebElement UserID;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logout;
	
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

//	public String expctedName(String UN)
//	{
//		String expctedText = UN;
//		return expctedText;
//	}

	public void NameValidation (String UN)
	{
		String expctedText = UN;
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
	public String getusername()
	{
		String actualUN=actualText.getText();
		return actualUN;
	}
	
	
	
	public void LogotClick()
	{
		UserID.click();
		logout.click();
	}

}
