package com.core;

public class Lorry extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lorry lo=new Lorry();
		lo.load();
		lo.engine();
		lo.tyre();
		
	}
	
	public void load()
	{
		System.out.println("Lorry contains 100000KG weight");
	}

	public void engine()
	{
		System.out.println("Engine 2500CC");
	}
}
