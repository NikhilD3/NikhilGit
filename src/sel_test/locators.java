package sel_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) 
	{
		
//		To create a webpage we need to use tagname <html> and to create a component or element we need to use tagname <input>
//		To create a listbox we use <select> tag
//		To create a link we use <a> tag (anchor)
//		To create a web table we use <table> tag
//		1.	Tag Name - Any keyword which is present after < symbol is known as tagname. E.g. <html> <body> <input>
//		2.	Attribute – Any keyword which is present after tagname with = symbol. E.g. type = ‘text’ value = ‘Login’ (type : attribute name & ‘text’ : attribute value)
//		3.	Text - Any keyword which is present (><) in between greater than symbol (>) & less than symbol (<). E.g. link1, India, Aus
//		<html>
//		   <body>
//		      UN<input type = ‘text’ id = ‘abc’> </br>
//		      PWD<input type = ‘password’ id = ‘456’> </br>
//		      <a href = ‘url’> Link1 </a>
//		      <input type = ‘Button’ value = ‘Login’> </br>
//		   </body>
//		</html>
		
//		Locators :
//			1.	Locators are used to identify an element present in a webpage with the help of locator types.
//			2.	To identify an element present in a webpage we need to use findElement() method which is present in WebDriver interface.
//			3.	findElement() method will identify an element with the help of “By” class which contains static methods.
//			4.	All the static methods present in a By class are known as locator types.
//
//			There are different types of locators : 
//			1.	ID
//			2.	Class
//			3.	Name
//			4.	Tagname
//			5.	Linked Text
//			6.	Partial Linked Text
//			7.	CSS Selector
//			8.	X-path
		
//		Xpath :
//			   WebDriver driver = new ChromeDriver();
//			   driver.get(“url”);
//			   driver.findElement(By.xpath(“xpath_expression”)).sendkeys(“abc”);
//			Types of xpath :
		
		
		//1.xpath by attribute
		//Syntax :
		//tagname[@attribute name = ‘attribute value’]

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.get("https://www.google.co.in/");
		
		//driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Nikhil Deshmukh");
		
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("India");
		
       //2.xpath by text
       //Syntax :
       //tagname[text() = ‘textvalue’]
		
		//a[text()='Velocity Corporate Training Center']
		
	   //3.	xpath by contains()
	   //a.	Here we can mention the substring without writing a whole text, when link is big in size.
	   //b.	If any non-breakable space (nbsp) is there.
		
		 //We can use contains in two ways:
		    
		   //1.Contains with text():
		   //syntax: //tagname[contains(text(),’textvalue’)]
		//legend[contains(text(),'Suggession')]
		
		   //2.Contains with attribute:
		   //syntax: //tagname[contains(@attribute name,'attribute value')]
		//div[contains(@id,'u_0_4')]
		
		//4.xpath by index
		//we use xpath by index when we have same attribute value on multiple attributes
		//we use syntax and use line number in square bracket at the end of sequence so our attribute value will be unique
		
		//input[@type='radio'][2]
		
		//5.Absolute and Relative xpath
	    // absolute xpath meaning root parent of our path that is HTML
		// relative xpath meaning immediate parent of selected path
		
		//absolute xpath - html/body/div[2]/input[1] (input[1] root parent is html and immediate parent is div[2])
		//relative xpath - //div[2]/input[1]
		
		//Disadvantages of Absolute xpath
		//1.Absolute xpath is too lengthy and time consuming.
		//2.Identifying an element by developing html tree diagram is difficult.
		
		//Absolute xpath:
		//Absolute xpath is used to navigate from root of parent to its immediate child. To achieve absolute xpath, we need to use ‘/’.
		
		//Relative xpath:
		//Relative xpath is used to navigate from parent to any child. To achieve relative xpath, we need to use ‘//’.

         //driver.findElement(By.xpath("(//input[@type='radio']) [2]")).click();
         
        // System.out.println(driver.findElement(By.xpath("//a[text()='Images']")).getText());


		
		

		

	}

}
