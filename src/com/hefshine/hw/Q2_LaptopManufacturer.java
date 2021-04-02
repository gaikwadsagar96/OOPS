/*Assume another company which is a laptop manufacturer company needs to develop laptops which does the following: 
 * On unlocking the screen it will display a “WELCOME” message first, After “ welcome “ message displays → 
 * “Enter Option:” 1. Add-1 2. Subtract-2 3. Multiply-3 4. Quit-4 The user should be allowed to enter an option. 
 * If the user enters 1, a message needs to be displayed, 3) “Enter two numbers to be added”. 
 * a. The user should be allowed to enter two numbers (In two separate lines). 
 * b. Based on the numbers entered, the program should add and display the result as below 
 * c. “The result is<result>” 
 * d. After the result is displayed, the program should loop back and ask for the next menu entry.
 *  If the user enters 4, the program should quit. 
 *  (The program needs to be executed and do either one of the options until the kid enters the option4) */
package com.hefshine.hw;

import java.util.Scanner;

public class Q2_LaptopManufacturer 
{
	static Scanner sc=new Scanner(System.in);
	static int n1;
	static int n2;
	public static void main(String[] args)
	{
		Q2_LaptopManufacturer lm=new Q2_LaptopManufacturer();
		int ch,r;
		System.out.println("WELCOME");
		while(true) {
			System.out.println("Enter Option:\n1. Add-1 \n2. Subtract-2 \n3. Multiply-3 \n4. Quit-4");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
					lm.input();
					r=n1+n2;
					System.out.println("The result is <"+r+">");					
				break;
			case 2:
				lm.input();
				r=n1-n2;
				System.out.println("The result is <"+r+">");					
			break;
			case 3:
				lm.input();
				r=n1*n2;
				System.out.println("The result is <"+r+">");					
			break;
			case 4:
				System.exit(4);

			default:
				System.out.println("Please enter valid number");
				break;
			}
		}
		

	}
	private void input() 
	{
		System.out.println("Enter number1 to be added");
		n1=sc.nextInt();
		System.out.println("Enter number2 to be added");
		n2=sc.nextInt();
	}

}
