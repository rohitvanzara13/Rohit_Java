package com.assignment2;

import java.util.HashMap;

/*
 Write a Java program to associate the specified value with the specified key in a Hash Map.
 */
public class program53 {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> age=new HashMap<String, Integer>();
		
		age.put("Aniket", 21);
		age.put("Dilip", 20);
		age.put("Shivarsh", 22);
		
		System.out.println("Hash map"+age);
	}

}
