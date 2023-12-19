package com.assignment2;

/*
 W.A.J.P to start the same Thread twice by calling start () method twice. 
 Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
 */

public class program39 extends Thread
{  
	 public void run()
	 {  
	   System.out.println("running...");  
	 }  
	 

	public static void main(String[] args) 
	{
		program39 t1=new program39();  
		  t1.start();  
		  t1.start(); 
	}

}

