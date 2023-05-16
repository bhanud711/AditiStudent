package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution2Test {
	@Test
	public void one()
	{
		System.out.println("One Method");
	}

	@AfterMethod
	public void two()
	{
		System.out.println("Two method");
	}

	@BeforeMethod
	public void three()
	{
		System.out.println("Three method");
	}

	@AfterClass
	public void four()
	{
		System.out.println("Four Method");
	}

	@BeforeClass
	public void five()
	{
		System.out.println("Five method");
	}

	@AfterTest
	public void six()
	{
		System.out.println("Six method");
	}

	@BeforeTest
	public void seven()
	{
		System.out.println("Seven Method");
	}

	@AfterSuite
	public void eight()
	{
		System.out.println("Eight Method");
	}

	@BeforeSuite
	public void nine()
	{
		System.out.println("Nine method");
	}
	@Test
	public void ten()
	{
		System.out.println("Ten Method");
	}
	@Test
	public void Fifty()
	{
		System.out.println("Fifty Method");
	}
}
