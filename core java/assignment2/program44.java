package com.assignment2;

/*
 Write a Java program to update specific array element by given element.
 */
public class program44 {

	public static void main(String[] args) 
	{
      int [] numbers= {1,2,3,4,5};
		
		int index=2;
		
		int newelement=10;
		
		numbers[index]=newelement;
		
		for(int number:numbers)
		{
			System.out.println(number);
		}
	}

}
