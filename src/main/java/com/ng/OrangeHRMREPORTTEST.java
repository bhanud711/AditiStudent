package com.ng;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OrangeHRMREPORTTEST {
public static ChromeDriver driver;
public static ExtentReports report;
public static ExtentTest test;
public static int i=0;

@BeforeSuite
public void begin()
{
	report=new ExtentReports(".//report//AditiReport.html",true);
	report.addSystemInfo("Author", "Aditi");
	report.addSystemInfo("ENV", "QA");
	report.addSystemInfo("Story", "US2345");
	test = report.startTest("To verify user is able to login orange hrm website");
}

     @Test
	public void hrmReport() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		test.log(LogStatus.PASS, "Entered UserName"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		test.log(LogStatus.PASS, "Entered Password"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "ClickedLoginbutton"+test.addScreenCapture(snap()));

	}
     
     @AfterSuite
     public void end()
     {
    	 report.endTest(test);
    	 report.flush(); 
     }
     
     public String snap() throws IOException
 	{
 		Random r=new Random(); 
 		String dummy="";
 		if(r.nextInt()!=0)
 		{
 			i=i+1;
 		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		File dest=new File(".//images//pic"+i+".png");
 		FileUtils.copyFile(src, dest);
 		dummy=dest.getAbsolutePath();
 		}
 		return dummy;
 	}
}
