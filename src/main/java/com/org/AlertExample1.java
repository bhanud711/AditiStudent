package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement button1 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]"));
		button1.click();
		Alert at = driver.switchTo().alert();
	    at.accept();
	    
	    
	    //Handling confirmation alert
	    WebElement conf = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    conf.click();
	    
	    WebElement button2 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]] "));
	    button2.click();
	    
	    Alert bt = driver.switchTo().alert();
	    bt.dismiss();
	    
	    //Handling prompt alert
	    WebElement pmp = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
        pmp.click();
	
        WebElement button3 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
        button3.click();
        Alert ct = driver.switchTo().alert();
        ct.sendKeys("Aditi");
        ct.accept();
        
        
        
	}

}
