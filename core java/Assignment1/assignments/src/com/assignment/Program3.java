package com.assignment;

import java.util.*;

public class Program3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:- ");
		int year=sc.nextInt();
		
		if(year%4==0) 
		{
			System.out.println(year+" is Leap Year");
		}
		else 
		{
			System.out.println(year+" is Not Leap Year");
		}

		//program 2
		
		int i=1;
		while(i<=10) 
		{
			System.out.println(i);
			i++;
		}
	}

}
