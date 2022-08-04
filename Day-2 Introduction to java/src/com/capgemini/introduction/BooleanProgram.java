package com.capgemini.introduction;

import java.util.Scanner;

//program on boolean

public class BooleanProgram {

	public static void main(String[] args) {
		System.out.println("Enter The VAlue X:");
		Scanner s=new Scanner(System.in);
		boolean x=s.nextBoolean();
		System.out.println(x);
		s.close();

	}

}
