package com.assignment2;

import java.util.HashMap;
import java.util.Map;

/*
 Write a Java program to check whether a map contains key-value mappings (empty) or not.
 */
public class program62 {

	public static void main(String[] args) 
	{
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		if(m.isEmpty())
		{
			System.out.println("The map is Empty..");
		}
		else
		{
			System.out.println("The map is not Empty..");
		}
	}

}
