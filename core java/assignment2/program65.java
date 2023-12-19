package com.assignment2;

import java.util.ArrayList;

/*
 Write a Java program to print all the elements of an Array List using the position of the elements.
 */
public class program65 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Apple");
		a.add("Banana");
		a.add("Chiku");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Element of position"+i+" "+a.get(i));
		}
	}

}
