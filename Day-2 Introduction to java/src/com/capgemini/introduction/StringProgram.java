package com.capgemini.introduction;

import java.util.Scanner;

//program on String
public class StringProgram {

	public static void main(String[] args) {
		System.out.println("Enter The Value X:");
		Scanner s=new Scanner(System.in);
		
		//next() will take first word
		//nextLine() will take entire line
		//String x=s.next();
		
		String x=s.nextLine();
		System.out.println(x);
		s.close();
	}

}
