package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame("singleframe");
		WebElement boarder = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(boarder);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Rama");
	}

}
