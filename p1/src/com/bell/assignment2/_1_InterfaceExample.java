package com.bell.assignment2;

import java.util.Scanner;

interface printable{
	default void draw(){
		System.out.println("Please enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("This is the result of printable interface : "+c);
		sc.close();
	}
}

interface printable1{
	default void draw(){
		System.out.println("This is the resultant of printable1 interface");
	}
}

public class _1_InterfaceExample implements printable,printable1 {
	public void draw(){
		System.out.println("How you doing");
	};
	public static void main(String args[]){
	printable obj1 = new _1_InterfaceExample();
	obj1.draw();
	//printable1 obj2 = new _1_InterfaceExample();
	//obj2.draw();
	}
	
	

}
