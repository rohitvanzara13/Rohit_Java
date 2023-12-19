package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class program43 {

	public static void main(String[] args) 
	{
         ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		
		int index=1;
		
		String element=colors.get(index);
		
		System.out.println("Element"+index+" "+index);
	}

}
