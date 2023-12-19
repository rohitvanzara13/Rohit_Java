package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to remove the third element from an array list.
 */
public class program45 {

	public static void main(String[] args) 
	{
        ArrayList<Integer> number= new ArrayList<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		number.remove(2);
		
		System.out.println(number);
	}

}
