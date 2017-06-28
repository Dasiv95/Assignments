package com.bell.assignment4;

public class _8_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		// We have to find out the index of j at the center
		int index = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='j')
				index = i;
		}
		System.out.println("The index of j at the center is : "+index);

	}

}
