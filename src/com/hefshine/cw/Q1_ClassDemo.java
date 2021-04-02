/*Write a program to display how to create a class and create different elements of a class
 *  (data members and member functions etc).Also create objects of that class for accessing 
 *  different elements to explain the concept of classes and objects. */
package com.hefshine.cw;

public class Q1_ClassDemo {
	static int a=10;
	int b=20;
	
	public static void main(String[] args) 
	{
		Q1_ClassDemo cd=new Q1_ClassDemo();
		cd.print();
		System.out.println("printing from main");
		System.out.println("a:"+a);
		
	}

	private void print() 
	{
		System.out.println("printion from method");
		System.out.println("b:"+b);
	}

}
