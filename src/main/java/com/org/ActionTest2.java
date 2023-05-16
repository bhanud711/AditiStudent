package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement boarder = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(boarder);
		WebElement apple = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement banana = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(apple, banana).build().perform();
	}

}
