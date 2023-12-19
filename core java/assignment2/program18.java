package com.assignment2;

/*
Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.
*/

class Member
{
	int Age;
	String Name,Address,PhoneNumber;
	int Salary;
	
	public void PrintSalary()
	{
		Salary=10000;
		System.out.println("Salary Of the Member : "+Salary);
	}
	
}
public class program18 {

	public static void main(String[] args) 
	{
		Member m1=new Member();
		
		m1.PrintSalary();
		

	}

}
