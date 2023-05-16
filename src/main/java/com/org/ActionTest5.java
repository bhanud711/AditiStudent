package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		//email.sendKeys("ramarao");
		a.moveToElement(email).sendKeys("ra").keyDown(Keys.SHIFT).sendKeys("ma").keyUp(Keys.SHIFT).sendKeys("ra").keyDown(Keys.SHIFT).sendKeys("o").build().perform();
	}

}
