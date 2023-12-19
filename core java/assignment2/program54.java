package com.assignment2;

import java.util.HashMap;

/*
 Write a Java program to count the number of key-value (size) mappings in a map.
 */
public class program54 {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> age=new HashMap<String, Integer>();
		
		age.put("Aniket", 21);
		age.put("Dilip", 20);
		age.put("Shivarsh", 22);
		
		int size=age.size();
		
		System.out.println("Number of key value mapping in the map"+age);

	}

}
