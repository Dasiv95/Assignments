/*
 * This program is to calculate the number of words in a string
 */

package com.bell.assignment4;

public class _1_Words {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String s = "This is a java class";
		System.out.println("Total length of string is : "+s.length());
		int count=0;
		for(int i=0;i<s.length();i++){
			if(Character.isWhitespace(s.charAt(i))){
				if(s.charAt(i)==s.charAt(i-1)){
					//This loop is to check the occurence of 2 simultaneous whitespaces.
					count+=1;
				}
				continue;
			}
			else
				count+=1;
		}
		System.out.println("Total number of characters in given string are : "+count);
		int nWords = s.length()-count+1;
		//Total # characters - total # characters excluding white spaces + 1 gives total 
		//number of words
		System.out.println("Number of words in the given string are : "+nWords);
}
		

	}


