package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

/*
 Write a Java program to shuffle elements in an array list.
 */
public class program49 {

	public static void main(String[] args) 
	{
        ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		Collections.shuffle(number);
		
		System.out.println("Shuffle"+number);
	}

}
