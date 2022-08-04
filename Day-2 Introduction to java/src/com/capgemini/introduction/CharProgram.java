package com.capgemini.introduction;

import java.util.Scanner;

//program on character
public class CharProgram {

	public static void main(String[] args) {
		// compile time
		char x='a';
		System.out.println(x);
		//runtime
		System.out.println("Enter the value of xl:");
		Scanner s=new Scanner(System.in);
		char xl=s.next().charAt(0);
		System.out.println(xl);
		s.close();
		

	}

}
