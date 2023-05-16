package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingConcept {
public static String parent,facebook,linkedIn,youtube,twitter;
public static Set<String> all;
public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    parent = driver.getWindowHandle();
	    System.out.println(parent);
	    Thread.sleep(5000);
	    WebElement fbIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
	    fbIcon.click();
	    System.out.println(driver.getTitle());
	     all = driver.getWindowHandles();
	    it = all.iterator();
	    while(it.hasNext())
	    {
	    	facebook=it.next();
	    	if(!parent.equals(facebook))
	    	{
	    		driver.switchTo().window(facebook);
	    	}
	    }
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	    email.sendKeys("Rama");
	    driver.switchTo().window(parent);
	    System.out.println(driver.getTitle());
	    WebElement LinkIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	    LinkIcon.click();
	    all = driver.getWindowHandles();
	    it = all.iterator();
	    while(it.hasNext())
	    {
	    	linkedIn=it.next();
	    	if(!parent.equals(linkedIn))
	    	{
	    		driver.switchTo().window(linkedIn);
	    	}
	    }
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(facebook);
	    System.out.println(driver.getTitle());
	    WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	    password.sendKeys("Krishna");
	}

}
