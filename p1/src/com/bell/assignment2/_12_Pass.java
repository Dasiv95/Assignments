package com.bell.assignment2;


public class _12_Pass {
	
	static int swap(int a,int b){
		a = a+b;
		b = a-b;
		a = a-b;
		return a;
	}
	public static void main(String args[]){
		System.out.println("This program is written to check whether Java follows call by value or call by reference");
		int x=23;
		int y=30;
        swap(x,y);
        System.out.println("The value of x is : "+x);
        System.out.println("The value of y is : "+y);
	}

}
