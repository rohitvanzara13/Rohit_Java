package com.assignment2;

/*
Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters. 
The method for printing area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side of square.
*/

class rect
{
	public void SquareAndRectangle(int length,int breadth)
	{
		int rectangle;
		rectangle=length*breadth;
		System.out.println(rectangle);
	}
	
	public void SquareAndRectangle(int side)
	{
		int square;
		square=side*side;
		System.out.println(square);
	}
}
public class program16 {

	public static void main(String[] args) 
	{
		rect r1=new rect();
		r1.SquareAndRectangle(10, 50);
		r1.SquareAndRectangle(40);
	}

}
