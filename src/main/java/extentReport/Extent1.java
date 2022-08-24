package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent1 
{
	
	public static void main(String[] args) 
	{
		ExtentHtmlReporter htmlreport =new ExtentHtmlReporter("C:\\Users\\User\\Desktop\\Screenshots\\first_report.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(htmlreport);
		
		ExtentTest test = extent.createTest("Chrome test","Chrome Web base applicatin testing");
		
		test.log(Status.INFO, "opening chrome");
		
		test.log(Status.INFO, "test case execution is started");
		
		test.log(Status.PASS, "Test case 01 is pass");
		
		test.log(Status.SKIP, "Test case 03 is skipped");
		
		test.log(Status.WARNING, "Test case is running too slow");
		
		
		ExtentTest test2 = extent.createTest("Firefox test","Firefox Web base applicatin testing");
		
		test2.log(Status.INFO, "opening firefox");
		
		test2.log(Status.WARNING, "Firefox is getting problem");
		
		test2.log(Status.SKIP, "Test case2 is skipped");
		
		extent.flush();
		
	}
	
	

}
