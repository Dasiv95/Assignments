/*
 * Come up with an awesome your Own object and build interfaces
 *  and abstract classes around
 */

package com.bell.assignment2;

interface Course{
	void time();
	void room();
	void examStructure();
	
}
interface finalMarks{
	void assesment();
}
abstract class Science implements Course,finalMarks{
	int lab1,lab2,mid1,mid2,finalm;
	int []asgn = new int[6];
	int []proj = new int[2];
	public void time(){
		System.out.println("Science course happens in its own time");
	}
	public void room(){
		System.out.println("Science course happens in its own room");
	}
	public void examStructure(){
		System.out.println("This course has 2 labs,2 mid terms,6 assignments,2 projects and 1 final");
	}
	public void assesment(){
	    int marks1=lab1+lab2+mid1+mid2+finalm;
	    System.out.println("The marks in Science are : "+marks1);
	}
	
}
class Social implements Course,finalMarks{
	int mid1,mid2,proj,finalS;
	public void time(){
		System.out.println("Social course happens in its own time");
	}
	public void room(){
		System.out.println("Social course happens in its own room");
	}
	public void examStructure(){
		System.out.println("Social has 2 midterms, 1 project,1 Final");
	}
	public void assesment(){
		int marks = mid1+mid2+proj+finalS;
		System.out.println("The final marks in Social Studies are : "+marks);
	}
}
abstract class Mathematics implements Course,finalMarks{
	int mid1,mid2,mid3,finalM;
	int []asgn = new int[8];
	public void time(){
		System.out.println("Mathematics course happens in its own time");
	}
	public void room(){
		System.out.println("Mathematics course happens in its own room");
	}
	public void examStructure(){
		System.out.println("Mathematics has 3 midterms,8 assignments,1 Final");
	}
	public void assesment(){
		int marks = mid1+mid2+mid3+finalM;
		System.out.println("The final marks in mathematics are : "+marks);
	}
}
class dSoc extends Social{
	
}
class dMat extends Mathematics{
	
}
class dSci extends Science{
	
}

public class _9_OwnObject {

	public static void main(String[] args) {
		System.out.println("This program is to understand the usage of interfaces.");
		System.out.println("Now we take course as interface and make different subjects implement that interface");
		Course c = new Social();
		c.time();
		c.room();
	}

}
