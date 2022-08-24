package testclass;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseclass.Browser;
import pom_classes.Home_Page;
import pom_classes.Login_Page;
import pom_classes.Login_Page2;
import utility.Utility_class;

@Listeners(utility.Utility_class.class)
public class VerifyProfileName extends Browser
{
	Login_Page login1;
	Login_Page2 login2;
	Home_Page home;
	Utility_class utility;
	
	@BeforeClass
	public void login() throws IOException    
	{
		
		 chrome();
		
		
		 utility =new Utility_class();
		 driver.get(utility.propertyfile());
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 login1=new Login_Page(driver);
		 login2=new Login_Page2(driver);
		 home=new Home_Page(driver);
		 
		
	}

	@BeforeMethod
	public void PreCondition() throws EncryptedDocumentException, IOException      
	{
		login1.enterUN(utility.open_excel(0, 0));
		
		login1.enterPass(utility.open_excel(1, 0));
		

		login1.clickonlogin();
		

		login2.enterpin(utility.open_excel(2, 0));
		

		login2.btn();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void VProfileName() throws EncryptedDocumentException, IOException 
	{
		home.verifypf(utility.open_excel(0, 0));
	    
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException 
	{
		driver.navigate().refresh();
	
	}
	
	@AfterClass
	public void closeBrowser() 
	{
	    driver.close();
	    
	}
	
	
}
