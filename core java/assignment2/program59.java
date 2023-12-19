package com.assignment2;

import java.util.ArrayList;

/*
  Write a Java program to join two array lists.
 */
public class program59 {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		ArrayList<Integer> joinlist=new ArrayList<Integer>();
		
		joinlist.addAll(list2);
		
		System.out.println("Joined Arraylist"+joinlist);
	}

}
