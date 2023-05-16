package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement account=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Thread.sleep(4000);
		WebElement list=driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		a.moveToElement(account).moveToElement(list).click().build().perform();
		
	}

}
