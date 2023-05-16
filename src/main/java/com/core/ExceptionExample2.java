package com.core;

public class ExceptionExample2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
int a[]= {10,20,30,50};
System.out.println(a[7]);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}

	}

}
