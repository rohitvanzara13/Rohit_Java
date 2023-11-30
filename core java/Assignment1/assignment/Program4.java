package com.assignment;

import java.util.*;

public class Program4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//scanner class
		int sum=0;//initialize sum=0;
		
		for(int i=1;i<=5;i++) //1 to 5 loop
		{
			System.out.println("Enter the number "+i);
			int num=sc.nextInt();
			sum=sum+num;
			
		}

		int avg=sum/5;//calculate average
		
		System.out.println("Sum:- "+sum);
		System.out.println("Average:- "+avg);
		
	
	}

}
