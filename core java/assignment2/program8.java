package com.assignment2;

import java.util.Scanner;

/*W.A.J.P to concatenate a given string to the end of another string.
 */

public class program8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1="Tops ";
		String str2="Technologies!";
		
		System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
        
        
		System.out.println(str1+""+str2);
	
        String str3 = str1.concat(str2);
        System.out.println(str3);
	}

}
