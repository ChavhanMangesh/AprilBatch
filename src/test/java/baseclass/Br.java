package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Br 
{
	public static WebDriver driver;
	public static void chrome() 
	{
	
	   System.setProperty("webdriver.chrome.driver", "D:\\javabykiran\\Java.Automation\\Cucumber\\Driver\\chromedriver.exe");
	   driver =new ChromeDriver();
	
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
}
