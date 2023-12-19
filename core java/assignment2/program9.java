package com.assignment2;

import java.util.Scanner;

/*
W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
*/

public class program9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1 :- ");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2 :- ");
		String str2=sc.nextLine();
		
		
	    System.out.println("Comparing "+str1+" and "+str1+": " + str1.contentEquals(str1));
	    System.out.println("Comparing "+str2+" and "+str1+": " + str2.contentEquals(str1));
		
	
	}

}
