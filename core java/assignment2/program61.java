package com.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 Write a Java program to convert a hash set to a List/Array List.
 */
public class program61 {

	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		
		h.add("Apple");
		h.add("Banana");
		h.add("Chiku");
		
		List<String> l=new ArrayList<String>(h);
		
		for(String element: l)
		{
			System.out.println(element);
		}
	}

}
