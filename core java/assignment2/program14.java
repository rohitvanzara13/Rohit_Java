package com.assignment2;

/*
Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.
*/

class PrintNumber
{
	public void printn(int a)
	{
		System.out.println(a);
	}
	
	public void printn(float b)
	{
		System.out.println(b);
	}
	public void printn(double c)
	{
		System.out.println(c);
	}
	public void printn(String d)
	{
		System.out.println(d);
	}
	public void printn(char e)
	{
		System.out.println(e);
	}
}

public class program14 {

	public static void main(String[] args) 
	{
		PrintNumber p1=new PrintNumber();
		p1.printn(10);
		p1.printn(11.55f);
		p1.printn(6655);
		p1.printn("Rohit");
		p1.printn('a');
	}

}
