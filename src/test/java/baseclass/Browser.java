package baseclass;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Browser 
{
	public static ChromeOptions options;
	public static WebDriver driver;
	
	
	public static void chrome() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javabykiran\\Java.Automation\\Cucumber\\Driver\\chromedriver.exe");
	    options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	    driver=new ChromeDriver(options);
		
		
	}
	
	
	
}
