package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import baseclass.Browser;

public class Utility_class extends Browser implements ITestListener
{
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test case is started");
		
		
	}
	public String propertyfile() throws IOException 
	{
		Properties file = new Properties();
		
		FileInputStream source=new FileInputStream("D:\\javabykiran\\Java.Automation\\Maven_Batch\\PropertyFile\\April1.properties");
		
		file.load(source);
		
		String url = file.getProperty("URL");
		
		return url;
	}

	public String open_excel(int no1,int no2) throws EncryptedDocumentException, IOException 
	{
		FileInputStream source=new FileInputStream("D:\\javabykiran\\Java.Automation\\Maven_Batch\\Excel\\Excel3.xlsx");
		
		Sheet sheet = WorkbookFactory.create(source).getSheet("Sheet1");
		
		String value = sheet.getRow(no1).getCell(no2).getStringCellValue();
		
		return value;
		
	}
	
	public void Screenshot() throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\javabykiran\\Java.Automation\\Maven_Batch\\ScreenShot\\Screenshot1.jpg");
		
		FileHandler.copy(source, dest);
	
	}
	
	public void onTestFailure(ITestResult result)
	{
		Utility_class utility =new Utility_class();
		
		try {
			utility.Screenshot();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
}
