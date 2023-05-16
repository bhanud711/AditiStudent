package com.org;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowntest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement courses = driver.findElement(By.xpath("//button[@id='menu1']"));
		courses.click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		/*Iterator<WebElement> it = all.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next().getText());
			if(it.next().getText().equals("JavaScript"))
			{
				it.next().click();
			}
		}   */
		for(WebElement each:all)
		{
			if(each.getText().equals("JavaScript"))
			{
				each.click();
			}	
		}
		
		
		
	
	
	}

}
