package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to replace the second element of an Array List with the specified element.
 */
public class program64 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Apple");
		a.add("Banana");
		a.add("Chiku");
		
		a.set(1, "Mango");
		
		System.out.println("Updated arraylist"+a);
	}

}
