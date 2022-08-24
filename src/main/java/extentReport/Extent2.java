package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent2 
{
	
	public static void main(String[] args)
	{
		
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("C:\\Users\\User\\Desktop\\Screenshots\\Second.html");
	
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(htmlreport);
		
		ExtentTest flipkart = extent.createTest("Flipkart application is running");
		
		flipkart.log(Status.INFO, "Flipkart server is down");
		
		flipkart.log(Status.PASS, "flipkart application is pass");
		
		flipkart.log(Status.WARNING,"Tomorrow flipkart applicatin will be closed");
		
		
		ExtentTest amazon = extent.createTest("Amazon application is running");
		
		amazon.log(Status.PASS, "Amazon application is successfully executed");
		
		extent.flush();
		
		
	}
	
}
