package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 
{
	
	@FindBy(xpath="//input[@id='pin']")private WebElement pin; 
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement continuebtn;
	
    public Login_Page2(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
	
    public void enterpin(String Pin) 
    {
    	pin.sendKeys(Pin);
    }
	
    public void btn() 
    {
    	continuebtn.click();
    }
    
    
	
}
