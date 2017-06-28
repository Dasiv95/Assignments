package com.bell.assignment4;

public class _3_single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		String[] words = s.split(" ");
		
		int wcount=0;
		for(int i=0;i<words.length;i++){
			if(words[i].length()==1){
				wcount=wcount+1;
			}
		}
		System.out.println("number of words:"+wcount);
		
		}
			

}
