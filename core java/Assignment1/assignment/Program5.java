package com.assignment;

public class Program5 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) //row loop 1 to 5
		{
			for(int j=1;j<=i;j++) //column loop 1 to i
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
