package com.assignment;

import java.util.*;

public class Program4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		for(int i=1;i<=5;i++) 
		{
			System.out.println("Enter the number "+i);
			int num=sc.nextInt();
			sum=sum+num;
			
		}

		int avg=sum/5;
		
		System.out.println("Sum:- "+sum);
		System.out.println("Average:- "+avg);
		
	
	}

}
