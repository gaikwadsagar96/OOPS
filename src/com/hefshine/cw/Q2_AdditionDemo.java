/*Create a class AdditionDemo having 3 instance variables number1 ,number2 and result. 
 * 1) Create 4 methods as a) addition b) subtraction c) multiplication d) division. 
 * 2) Calculate different operations as per the methods determined above. 
 * Create objects of AdditionDemo from main method of another class Addition.*/
package com.hefshine.cw;

public class Q2_AdditionDemo 
{
	int n1=10,n2=20,r;
	public static void main(String[] args) 
	{
		Q2_AdditionDemo ad=new Q2_AdditionDemo();
		ad.addition();
		ad.substraction();
		ad.multiplication();
		ad.division();

	}
	private void division() {
		System.out.println("division:"+(r=n2/n1));
		
	}
	private void multiplication() {
		System.out.println("Multiplication:"+(r=n1*n2));
		
	}
	private void substraction() {
		System.out.println("substraction:"+(r=n1-n2));
	}
	private void addition() {
		System.out.println("addition:"+(r=n1+n2));
		
	}

}
