package com.assignment2;
 import java.util.*;
/*
Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and 
"This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
*/




abstract class parent1
{
	abstract void message();
}
class Firstsubclass extends parent1
{

	@Override
	void message() {
		System.out.println("This is First Sub Class..");
		
	}

	
}
class Secondsubclass extends parent1
{

	@Override
	void message() {
		System.out.println("This is Second Sub Class..");
	}

	
}
public class program22 
{
	public static void main(String[] args) 
	{
		Firstsubclass f1=new Firstsubclass();
		f1.message();
		
		Secondsubclass s1=new Secondsubclass();
		s1.message();
	}

}
