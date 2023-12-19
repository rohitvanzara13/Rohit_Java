package com.assignment2;

/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
creating a class named 'Triangle' without any parameter in its constructor.
*/

class Triangle
{
	int s1,s2,s3;
	
	public Triangle() 
	{
		s1=3;
		s2=4;
		s3=5;
	}
	
	
	public int Perimeter()
	{
		return s1+s2+s3;
	}
	
	public int Area()
	{
		int s=Perimeter()/2;
		return (s*(s-s1)*(s-s2)*(s-s3));
	}
}

public class program20 {

	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		System.out.println("Area of Triangle: "+t1.Area());
		System.out.println("Perimeter of Triangle: "+t1.Perimeter());
	}

}
