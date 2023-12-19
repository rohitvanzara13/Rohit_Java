package com.assignment2;

import java.util.Scanner;

/*
Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn. Input number: 5
5 + 55 + 555
*/

public class program4 {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number :- ");
		int n=sc.nextInt();
		int n1=(n*10)+n;
		int n2=(n*100)+n1;
		
		System.out.println(n+n1+n2);
		
	}

}
