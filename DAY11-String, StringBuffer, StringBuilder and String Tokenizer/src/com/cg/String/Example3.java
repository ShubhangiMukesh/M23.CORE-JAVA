package com.cg.String;

public class Example3 {

	public static void main(String[] args) {
	
		String str="shubhangi";   //using litral 
		String str1="shubhangi";
		System.out.println(str==str1);
		
		String str2=new String("shubhangi");   //using keyword
		String str3=new String("shubhangi");

	
		System.out.println(str==str2);
		System.out.println(str2==str3);
        System.out.println(str2.equals(str3));

        System.out.println(str.concat(str1)); //merge or combine two strings
	}

}