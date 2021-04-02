/* Write a program to show the implementation and use of local, instance and static variables in different context.*/
package com.hefshine.cw;

public class Q3_UseOfVaribles 
{
	int a=10;
	static int b=20;
	
	public static void main(String[] args) 
	{
		Q3_UseOfVaribles uv=new Q3_UseOfVaribles();
		uv.display();
		
	}

	private void display() 
	{
		int c=30;
		System.out.println("instance varible a:"+a);
		System.out.println("local variable c:"+c);
		System.out.println("Static variable b:"+b);
		
	}

}
