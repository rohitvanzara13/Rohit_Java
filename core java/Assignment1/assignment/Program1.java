package com.assignment;

import java.util.*;

public class Program1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//Scanner class
		System.out.println("Enter the three number:- ");
		
		int a,b,c;//data type
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c) //elseifLadder condition
		{
			System.out.println(a);
		}
		else if(b>a&&b>c) 
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}

	}

}
