package com.bell.assignment2;

interface soap{
	static {
		System.out.println("Static block");
	}
	{System.out.println("Initializer block");}
}

public class _3_StatInstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This doesn't work");

	}

}
