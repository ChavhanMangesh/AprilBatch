package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	@FindBy(xpath="//input[@id='email']") private WebElement user;
	@FindBy(xpath="//input[@id='pass']") private WebElement pass;
	@FindBy(xpath="//button[text()='Log In']") private WebElement login;
	
	public Home(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterun() 
	{
		user.sendKeys("Email ID");
	}
	
	public void enterpwd() 
	{
		pass.sendKeys("password");
	}
	
	public void clickbtn()
	{
		login.click();
	}
	
}
