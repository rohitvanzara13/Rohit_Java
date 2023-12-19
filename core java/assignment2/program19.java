package com.assignment2;

/*
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle.
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'.
Print the area and perimeter of a rectangle and a square.
*/

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int Area()
	{
		return length*breadth;
	}
	
	public int perimeter()
	{
		return 2*(length+breadth);
		
	}
}
class Square extends Rectangle
{

	public Square(int side)
	{
		super(side,side);
		
	}
	
}

public class program19 {
	

	public static void main(String[] args) 
	{
	
		Rectangle r=new Rectangle(4, 5);
		System.out.println("Rectangle of  Area: "+r.Area());
		System.out.println("Rectangle of  Perimeter: "+r.perimeter());
		
		Square s=new Square(3);
		System.out.println("Square of  Area: "+s.Area());
		System.out.println("Square of Perimeter: "+s.perimeter());

	}

}
