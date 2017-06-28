/*
 * Create a class static block, instance block and default constructor.
 *  create object for the same class
 *  and let me know the sequence of execution ?
 */

package com.bell.assignment2;

public class _5_StaInstanceNormal {
	_5_StaInstanceNormal(){
		System.out.println("Constructor is called");
	}
	static {
		//This is the static block
		System.out.println("Static block is called");
	}
	{
		// This is the instance block
		System.out.println("Instance block is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_5_StaInstanceNormal a = new _5_StaInstanceNormal();

	}

}
