package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

/*
 Write a Java program to sort a given array list.
 */
public class program47 {

	public static void main(String[] args) 
	{
        ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(5);
		number.add(2);
		number.add(8);
		number.add(1);
		
		Collections.sort(number);
		
		System.out.println("Sort"+number);
	}

}
