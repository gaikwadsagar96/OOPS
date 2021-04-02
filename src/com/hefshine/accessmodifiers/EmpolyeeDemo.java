/*Problem Statement: 2. Follow the instructions: a) Create a class EmployeeDemo 
 * b) Create 4 variables with the modifier as  emp_id(protected),emp_name(pUBlic),emp_salary(private),emp _dept(deaUlt). 
 * c) Create 4 methods with the signatUREs as PUBlic void doPUBlic(),defaUlt void doDefaULt(),protected void doProtected(),private void doPrivate().
 * d) Initialize these variables by entering data from the User and display the data of the employee. 
 * e) Access all the variables from these 4 methods to check the visibility and scope of variables. 
 * f) Perform the above tasks in same package,same class and in different package in different class*/
package com.hefshine.accessmodifiers;

public class EmpolyeeDemo 
{
	protected int emp_id;
	public String emp_name;
	private int emp_salary;
	String emp_dept;

	public static void main(String[] args) 
	{
		EmpolyeeDemo ed=new EmpolyeeDemo();
		ed.doPUBlic();
		ed.doDefaULt();
		ed.doProtected();
		ed.doPrivate();
		

	}

	private void doPrivate() 
	{
	
		
	}

	protected void doProtected() 
	{
	
		
	}

	void doDefaULt() 
	{
		
	}

	public void doPUBlic() 
	{
				
	}

}
