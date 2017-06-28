package com.bell.assignment4;

public class _7_Center {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		System.out.println("Total length of string is : "+s.length());
		int a = s.length()/2 -1;
		if(s.charAt(a)==' ')
		System.out.println("The letter at the center is : "+s.charAt(a+1));
		else
			System.out.println("The letter at the center is : "+s.charAt(a));

	}

}
