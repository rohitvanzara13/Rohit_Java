package com.assignment2;

import java.util.Scanner;

/*
 * W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is o
 */

public class program7 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		String str="Tops Technologies!!";
		System.out.println("Original String = " + str);
		
		 int index1 = str.charAt(0);
	     int index2 = str.charAt(10);

	        System.out.println("The character at position 0 is " + (char)index1);
	        System.out.println("The character at position 10 is " +(char)index2);
		
	}

}
