package com.assignment2;

import java.util.HashSet;

/*
 Write a Java program to append the specified element to the end of a hash set.
 */
public class program50 {

	public static void main(String[] args) 
	{
        HashSet<String> fruit=new HashSet<String>();
		
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		
		String newfruit="Mango";
		
		fruit.add(newfruit);
		
		System.out.println("Update"+fruit);
	}

}
