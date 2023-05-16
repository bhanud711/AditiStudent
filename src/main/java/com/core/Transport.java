package com.core;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport tr=new Transport();
		tr.vehical(98678);
		tr.vehical("kishore");
	}
	public void vehical()
	{
	System.out.println("vehical is two wheeler");
	}

	public void vehical(int number)
	{
		System.out.println("vehical number is"+number);
	}
	public void vehical(String personname)
	{
		System.out.println("Vehical is driving by prashanth"+personname);
	}

}
