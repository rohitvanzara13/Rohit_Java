package com.assignment2;

/*
 W.A.J. P to demonstrate try catch block,
 */

public class program28 {

	public static void main(String[] args) 
	{
	
		try 
		{
			int [] number= {1,2,3};
			System.out.println(number[4]);
		} catch (Exception e) 
		{
			System.out.println(" "+e.getMessage());
			
		}
	}

}
