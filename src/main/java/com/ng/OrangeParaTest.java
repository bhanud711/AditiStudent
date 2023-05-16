package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeParaTest {

	@Test
	@Parameters({"user","pass"})
	public void hrm(String data1,String data2) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data2);
	}
}
