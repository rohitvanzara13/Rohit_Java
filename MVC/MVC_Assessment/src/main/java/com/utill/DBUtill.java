package com.utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {

	Connection cn=null;
	public Connection getConnectionData()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root", "");
			System.out.println("Connection Established...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cn;
	}

}
