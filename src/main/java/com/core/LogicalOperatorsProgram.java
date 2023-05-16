package com.core;

public class LogicalOperatorsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=40;
		int d=56;
		int e=10;
		int f=32;
		System.out.println((a>b)&&(a>c)); //true&&false--->false
		System.out.println((c>d)&&(e>b)); //false&&true--->false
		System.out.println((d>c)&&(f>e)); //true&&true---->true
		System.out.println((a>c)||(c>d)); //false ||false--false
		
	}

}
