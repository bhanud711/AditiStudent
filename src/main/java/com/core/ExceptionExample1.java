package com.core;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10;
int b=30;
int c=0;
int d=6;
System.out.println(a-d); //4
System.out.println(a+b);
System.out.println(d/c); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
