package com.bell.assignment2;

class Parent{
	int a=10;
	double b=5.0;
	void Pmethod(){
		System.out.println("This is the first method from parent class");
	}
	void Pmethod2(){
		System.out.println("This is the second method from parent class");
	}
	
}
class Child extends Parent{
	int a=15;
	double b=2.0;
	float c=21.00f;
	int d = 54;
	void Pmethod2(){
		System.out.println("This is the second method of parent class being overridden");
	}
	public int Cmethod(){
		System.out.println("This is the child method");
		return 1;
	}
}

public class _7_parentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1 = new Child();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	/*	obj1.Pmethod();
		obj1.Pmethod2();
		obj1.Cmethod();
		System.out.println("This is a variable of child class"+obj1.c);
		Parent obj2 = new Parent();
		System.out.println("This is the variable of parent class"+obj2.a);
		obj2.Pmethod2();
		*/
		

	}

}
