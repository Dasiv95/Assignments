package com.bell.assignment3;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		Student[] obj = new Student[n];
		int count=0;
		int id[] =new int[n];
		String []name = new String[n];
		double[] fee = new double[n];
		char[] section = new char[n];
		for(int i=0;i<n;i++){
			count=i+1;
			System.out.println("Enter Student "+count+" ID:");
			id[i]=sc.nextInt();
			System.out.println("Enter Student "+count+" NAME:");
			name[i]=sc.next();
			System.out.println("Enter Student "+count+" FEE:");
			fee[i]=sc.nextDouble();
			System.out.println("Enter Student "+count+" SECTION:");
			section[i]=sc.next().charAt(0);
			obj[i] = new Student(id[i],name[i],fee[i],section[i]);
		}
		System.out.println("ID"+"\t"+"Name"+"\t"+"Fee"+"\t"+"Section");
		for(int i=0;i<n;i++){
			System.out.println(obj[i].getId()+"\t"+obj[i].getName()+"\t"+obj[i].getFee()+"\t"+obj[i].getSection()+"\t");
		}

	}

}

