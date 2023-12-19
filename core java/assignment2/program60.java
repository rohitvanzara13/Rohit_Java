package com.assignment2;

import java.util.HashSet;

/*
 Write a Java program to convert a hash set to an array.
 */
public class program60 {

	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		
		h.add("Apple");
		h.add("Banana");
		h.add("Chiku");
		
		String[] array=h.toArray(new String[h.size()]);
		
		for(String element:array)
		{
			System.out.println(element);
		}
	}

}
