package com.bell.assignment4;

public class _9_repeatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		System.out.println("The following string is the original string : \n"+s);
		//String[] words = s.split("");
		//System.out.println(words[1]);
		String[] a=s.split("");
		int []b = new int[a.length]; // array to store number of times a letter repeated
		for(int i=0;i<a.length;i++)
			b[i]=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i].equals(a[j]))
					++b[i];
			}
		}

		for(int i=0;i<a.length;i++){

				System.out.println(a[i]+"\t"+"-"+"\t"+b[i]);
			
		/*	for(int j=i-1;j>=0;j--){
				if(a[i].equals(a[j]))
					continue;
				System.out.println(a[i]+"\t"+"-"+"\t"+b[i]);
				
			} */
				
		}
		
		//for(int i =0 ; i<a.length;i++)
			//System.out.println(b[i]);

	}

}
