/* Let us Assume and do the programming: An organization provides Diwali bonus of 35% to their employees.
 *  If the year of service of that employee is more than 5 years and 
 *  gives Diwali bonus of 15% to the employees if the year of service is less than 5 years. .
 *  Now Create a class and its respective methods to enter the data from the user and calculate total salary of the employee */
package com.hefshine.hw;

import java.util.Scanner;

public class Q1_DiwaliBonus 
{
	static int salary;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Q1_DiwaliBonus db=new Q1_DiwaliBonus();
		int ex=db.input();
		db.calculateBonus(salary,ex);
	}

	private void calculateBonus(int salary2,int ex)
	{
		if(ex>=5)
			System.out.println("Bonus: "+((salary*35)/100));
		else {
			System.out.println("Bonus: "+((salary*15)/100));
		}
		
	}

	private int input() 
	{
		System.out.println("Enter salary:");
		salary=sc.nextInt();
		System.out.println("Enter experiance:");
		int ex=sc.nextInt();
		return ex;
		
	}
}
