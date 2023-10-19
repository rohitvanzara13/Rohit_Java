package com.assignment;

import java.util.*;

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Single Character from the Alphabet :-");
		char ch =sc.next().charAt(0);
			
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
			System.out.println(ch+" is Vowel");
			
		}
		else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') 
		{
			System.out.println(ch+" is Consonant");
		}
		else  
		{
			System.out.println("Error");
		}
								

	}

}
