package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to search an element in an array list.
 */
public class program46 {

	public static void main(String[] args) 
	{
        ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Blue");
		
		String search="Green";
		
		boolean found=colors.contains(search);
		
		if(found)
		{
			System.out.println(" "+search+"Found");
		}
		else
		{
			System.out.println(" "+search+"Not Found");
		}
	}

}
