package com.assignment2;

import java.util.HashSet;
import java.util.Iterator;

/*
 Write a Java program to iterate through all elements in a hash list.
 */
public class program51 {

	public static void main(String[] args) 
	{
        HashSet<String> fruit=new HashSet<String>();
		
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		
		Iterator<String> iterator=fruit.iterator();
		while(iterator.hasNext())
		{
			String fruit1=iterator.next();
			System.out.println(fruit1);
		}
	}

}
