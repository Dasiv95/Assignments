package com.bell.assignment2;

abstract class Demo{
	Demo(){
		System.out.println("Constructor is called");
	}
	static {
		System.out.println("Static block is called");
	}
	
	{System.out.println("Instance block is called");}
	
	abstract void dummy();
}
class Assistant extends Demo{
	Assistant(){
		super();
	}
	void dummy(){
		System.out.println("This is from Assistant class");
	}
}

public class _4_StatAbstrBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assistant a = new Assistant();
		a.dummy();

	}

}
