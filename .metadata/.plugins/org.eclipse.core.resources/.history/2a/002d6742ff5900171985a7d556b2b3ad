/*
 * 6) Create object for a class which implements two interfaces and an abstract class
 *  and verify the visibility of all the methods(both dummy and concrete).
 */

package com.bell.assignment2;

interface a1{
	void dummy1();
}
interface a2{
	void dummy2();
}
abstract class a3{
	abstract void dummy3();
	private int abmeth(){
		System.out.println("abstract method call");
		return 0;
	}
}

class Jarvis extends a3 implements a1,a2{
	public void dummy1(){
		System.out.println("This is dummy method of interface 1");
	}
	public void dummy2(){
		System.out.println("This is dummy method of interface 2");
	}
	void dummy3(){
		System.out.println("This is the dummmy method from abstract class");
	}
	
}

public class _6_visibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jarvis a = new Jarvis();
		a.abmeth();
	}

}
