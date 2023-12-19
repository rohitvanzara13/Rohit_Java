package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to increase the size of an array list.
 */
public class program63 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		a.ensureCapacity(10);
		
		System.out.println("Updated size of array list."+a.size());
	}

}
