package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

/*
 Write a Java program of swap two elements in an array list.
 */
public class program58 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("Original Arraylist."+list);
		
		Collections.swap(list, 1, 2);
		
		System.out.println("Modified Arraylist."+list);
	}

}
