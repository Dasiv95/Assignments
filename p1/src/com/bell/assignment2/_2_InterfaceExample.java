package com.bell.assignment2;
//Tried to implement 2 interfaces with same method name and different types. But found 
//out that we cannot implement interfaces in such manner.
import java.util.Scanner;

interface printable2{
	default void sum(){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("This is the result of printable interface : "+c);
		sc.close();
	}
}
interface printable3{
	default int sum(){
		return 0;
	}
}
public class _2_InterfaceExample implements printable2,printable3 {
	public void sum(){
		System.out.println("This must be from 1st interface");
	}
	public int sum(){
		return 0;
	}
	

	public static void main(String[] args) {
		printable2 obj1 = new _2_InterfaceExample();
		printable3 obj2 = new _2_InterfaceExample();
		obj1.sum();
		obj2.sum();
		
		

	}

}
