package com.assignment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 Write a Java program to get a collection view of the values contained in this map.
 */
public class program67 {

	public static void main(String[] args) 
	{
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1, "Apple");
		m.put(2, "Banana");
		m.put(3, "Chiku");
		
		Collection<String> v=m.values();
		
		System.out.println("Values"+v);
	}

}
