package com.assignment2;

/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3.*/


public class program11 {

	public static void main(String[] args) 
	{
		String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

      
        String start = "Red";

       
        boolean s1 = str1.startsWith(start);
        boolean s2 = str2.startsWith(start);

        
        System.out.println( str1 + " starts with " +start + "? " + s1);
        System.out.println(str2 + " starts with " +start + "? " + s2);
	}

}
