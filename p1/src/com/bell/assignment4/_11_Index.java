package com.bell.assignment4;

import java.util.Scanner;

public class _11_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		String[] words = s.split(" ");
		System.out.println("Please enter the word to which you want to find the index:");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int index=0;
		for(int i=0;i<words.length;i++){
			if(a.equals(words[i]))
				index=i;
		}
		int count=0;
		String []w1 = s.split("");
		for(int i=0;i<w1.length;i++){
			if(w1[i].equals(" "))
				++count;
			if(count==index){
				if(index==0){
					System.out.println("The index of the searched word is : "+(i));
					break;
				}
				System.out.println("The index of the searched word is : "+(i+1));
				break;
			}
		}

	}

}
