package com.capgemini.introduction;

import java.util.Scanner;

//Program on run time input
public class IntegerRunTimeInput {

	public static void main(String[] args) {
		System.out.println("Enter The value X:");
	 Scanner s=new Scanner(System.in);
	 int x=s.nextInt();
	System.out.println(x);
	s.close();

	}

}
