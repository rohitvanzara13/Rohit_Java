package com.assignment2;

import java.util.Scanner;

/*
Write a Java program that reads a positive integer and count the number of digits the
number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6
*/


public class program1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number less than ten billion :- ");
		int num=sc.nextInt();
		
		int count=0;
		
	    while(num!=0)
	    {
	    	num=num/10;
	    	count++;
	    }
	    System.out.println(count);
	}

}
