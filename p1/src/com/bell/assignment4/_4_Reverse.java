package com.bell.assignment4;

public class _4_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		System.out.println("The following string is the original string : \n"+s);
		String[] words = s.split(" ");
		StringBuilder[] sb= new StringBuilder[words.length];
		StringBuilder sa = new StringBuilder("");
		for(int i=0;i<words.length;i++){
			sb[i]=new StringBuilder(words[i]);
			sb[i]= sb[i].reverse();
			sa = sa.append(sb[i]);
			sa = sa.append(" ");
		}
		System.out.println("The required string is the following \n"+sa);

	}

}
