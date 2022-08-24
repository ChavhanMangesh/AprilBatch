package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Home_Page 
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement profile;
	
	public Home_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifypf(String username) 
	{
		SoftAssert soft=new SoftAssert();
		
		String act = profile.getText();
		soft.assertEquals(act, username,"act exp are not equal");
		
		soft.assertAll();
		
		
		
		
//		String act = profile.getText();
//		
//		if(act.equals("VPL219")) 
//		{
//			System.out.println("Test case is pass");
//		}
//		else
//		{
//			System.out.println("Test case is fail");
//		}
	}
	
	
}
