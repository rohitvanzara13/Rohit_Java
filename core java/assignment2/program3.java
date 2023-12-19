package com.assignment2;

import java.util.Scanner;

/*
 * • Write a Java program to print the ASCII value of a given character.
 */

public class program3 {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character :- ");
		char ch=sc.next().charAt(0);
		int value = ch; 
		
		System.out.println("ASCII value = "+value);
	}

}
