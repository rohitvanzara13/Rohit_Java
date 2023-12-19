package com.assignment2;

/*
Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. 
For example, if the parameters of the first method are of the form (int n, char c), then 
that of the second method will be of the form (char c, int n).
*/

class parameter
{
	public void Para(int n,char c)
	{
		System.out.println("Integer: "+n+" Character: "+c);
	}
	
	public void Para(char c,int n)
	{
		System.out.println("Character: "+c+" Integer: "+n);
	}
}

public class program15 {

	public static void main(String[] args) 
	{
		parameter p1=new parameter();
		p1.Para(10, 'b');
		p1.Para('r',100);
		
	}

}
