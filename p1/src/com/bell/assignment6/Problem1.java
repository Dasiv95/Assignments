package com.bell.assignment6;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("This is a program to display a 2 dimensional multiplication table");
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}

	}

}
