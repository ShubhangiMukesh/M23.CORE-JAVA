package com.capgemini.oop;

import java.util.Scanner;

class Vehicle
{
//variable
	int a;
	//user define method 
	void display()
	{
		System.out.println("Welcome");
	}
}

public class RuntimeClassAndObject {

	public static void main(String[] args) {
		//object creation
		Vehicle obj=new Vehicle();
		System.out.println("Enter the value of a:");
		//Scanner class
		Scanner sl=new Scanner(System.in);
		int a=sl.nextInt();
		//accessing the class method
		obj.display();
		//accessing the class variable
		//obj.a=50;
		System.out.println(a);
		sl.close();

	}

}
