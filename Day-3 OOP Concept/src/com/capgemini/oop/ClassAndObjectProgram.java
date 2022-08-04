package com.capgemini.oop;
//Program on class and object

class A{
	       //variable
			int a;
			//user-defined method
			void display() {
				System.out.println("Welcome");
			}
       }
public class ClassAndObjectProgram {

	public static void main(String[] args) {
		//object Creation
		A obj=new A();
		//accesing the class mathod
		obj.display();
		//accesing the class variable
		obj.a=5;
		System.out.println(obj.a);

	}

}
