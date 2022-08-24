package testclass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Br;
import pom_classes.Home;

public class Vp extends Br
{
	Home h;
	@BeforeClass
	public void login() 
	{
		chrome();
		 h=new Home(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	@BeforeMethod
	public void preacond() 
	{
		h.enterun();
		h.enterpwd();
		
	}
	@Test
	public void testscript() 
	{
		h.clickbtn();
	}
	@AfterMethod
	public void refresh() 
	{
		driver.navigate().refresh();
	}
	@AfterClass
	public void close() 
	{
		driver.close();
	}
	
}
