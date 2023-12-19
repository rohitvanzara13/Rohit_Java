package com.assignment2;

import java.util.Scanner;

/*
Write a Java program to count the letters, spaces, numbers and other characters of
an input string.
*/


public class program2 {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String :- ");
		String s=sc.nextLine();
		
		int letters=0,spaces=0,numbers=0,others=0;
		
		 char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letters++;
			}
			else if(Character.isDigit(ch[i]))
			{
				spaces++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				numbers++;
			}
			else
			{
				others++;
			}
		}
		System.out.println(letters);
		System.out.println(spaces);
		System.out.println(numbers);
		System.out.println(others);
	}

}
