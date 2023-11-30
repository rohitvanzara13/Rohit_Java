package com.assignment;

import java.util.*;

public class Program3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//scanner class
		System.out.println("Enter the Year:- ");
		int year=sc.nextInt();//get year
		
		if(year%4==0) // if year%4==0 than leap year otherwise not.
		{
			System.out.println(year+" is Leap Year");
		}
		else 
		{
			System.out.println(year+" is Not Leap Year");
		}

		//program 2
		
		int i=1;
		while(i<=10) //1 t0 10 loop 
		{
			System.out.println(i);
			i++;
		}
	}

}
