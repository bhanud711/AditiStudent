package com.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("rama");
		li.add("krishna");
		li.add("hanuma");
		li.add("gopi");
		li.add("murali");
		System.out.println(li);
		li.add("krishna");
		li.add("murali");
		System.out.println(li);
		System.out.println("Printing index value: "+li.get(3));
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
