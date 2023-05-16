package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().refresh();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='Rama';");
		WebElement object=driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].value='rama';",object);
		
		//js.executeScript("document.getElementById('u_0_5_HC').click();");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click();",button);
		
		//getting title 
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//getting url 
				String weburl=js.executeScript("return document.URL;").toString();
				System.out.println(weburl);
				
				//refreshing a screen
				js.executeScript("history.go(0)");
	}

}
