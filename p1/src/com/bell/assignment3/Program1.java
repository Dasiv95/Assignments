package com.bell.assignment3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of students: ");
		int n = sc.nextInt();  //number of students
		int[] id = new int[n];
		String[] name = new String[n];
		double[] fee = new double[n];
		char[] section = new char[n];
		int count = 0;
		for(int i=0; i<n ; i++){
			count=i+1;
			System.out.println("ENTER STUDENT "+count+" ID:");
			id[i] = sc.nextInt();
			System.out.println("ENTER STUDENT "+count+" NAME:");
			name[i]= sc.next();
			System.out.println("ENTER STUDENT "+count+" FEE:");
			fee[i]=sc.nextDouble();
			System.out.println("ENTER STUDENT "+count+" SECTION:");
			section[i]=sc.next().charAt(0);
		}
		System.out.println("ID \t NAME \t FEE \t SECTION");
		for(int i = 0;i<n;i++){
			System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
		}
		
		

	}

}
