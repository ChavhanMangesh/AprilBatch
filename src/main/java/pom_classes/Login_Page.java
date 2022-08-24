package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{

	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement login;
	
	
	public Login_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN(String username) 
	{
		UN.sendKeys(username);
	}
	
	public void enterPass(String Password) 
	{
		pass.sendKeys(Password);
	}
	
	public void clickonlogin() 
	{
		login.click();
	}
	
	
}
