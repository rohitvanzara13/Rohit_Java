package com.assignment2;

/*
 Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero
 */
import java.util.*;
public class program29 {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try 
		{
			int result=num1/num2;
			System.out.println("Result: "+result);
		} catch (ArithmeticException e)
		{
			System.out.println("Error..");
				}
	}

}
