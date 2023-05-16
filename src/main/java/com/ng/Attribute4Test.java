package com.ng;

import org.testng.annotations.Test;

public class Attribute4Test {

	@Test(dependsOnMethods= {"apple"})
	public void mango()
	{
		System.out.println("Mango");
	}
	
	@Test()
	public void banana()
	{
		System.out.println("Banana");
	}
	
	@Test(dependsOnMethods= {"grapes"})
	public void apple()
	{
		System.out.println("Apple");
	}
	
	@Test(dependsOnMethods= {"banana"})
	public void grapes()
	{
		System.out.println("Grapes");
	}

}
