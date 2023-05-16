package com.core;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="rama";
String name2="murali";  //length is 6
String name3="hari";
String name4="gopi"; // 0 is g  1 is o  and 2 is p   index always starts from zero
String name5="HARI";
System.out.println(name1.toUpperCase());
System.out.println(name5.toLowerCase());
System.out.println(name1.concat(name2));
System.out.println(name3.equals(name5));
System.out.println(name3.equalsIgnoreCase(name5));
System.out.println(name2.charAt(3));
System.out.println(name4.indexOf('p'));
System.out.println(name2.length());
System.out.println(name4.isEmpty());
System.out.println(name4.endsWith("p"));
System.out.println(name4.endsWith("i"));
System.out.println(name5.startsWith("H"));

	}

}
