package com.bell.assignment6;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("This is a program to display a 3 dimensional multiplication table");
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++){
			for(int j =1;j<=10;j++){
				System.out.println(n+"*"+i+"*"+j+"="+(n*i*j));
			}
		}

	}

}
