package Assessment;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class table implements ActionListener
{
	
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	
	public table() 
	{
		

	frame =new JFrame("My Swing Example");
	frame.setLayout(new GridLayout(8, 2));
	frame.setVisible(true);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	l1=new JLabel("ID");
	t1=new JTextField(25);
	
	l2=new JLabel("FIRST NAME ");
	t2=new JTextField(25);
	
	l3=new JLabel("LAST NAME");
	t3=new JTextField(25);
	
	l4=new JLabel("EMAIL ");
	t4=new JTextField(25);
	
	l5=new JLabel("MOBILE ");
	t5=new JTextField(25);
	
	
   b1=new JButton("INSERT");
   b2= new JButton("SEARCH");
   b3=new JButton("UPDATE");
   b4= new JButton("DELETE");
   
    b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
   msg=new JLabel("");
	
	frame.add(l1);
	frame.add(t1);
	frame.add(l2);
	frame.add(t2);
	frame.add(l3);
	frame.add(t3);
	frame.add(l4);
	frame.add(t4);
	frame.add(l5);
	frame.add(t5);
	
	frame.add(b1);
	frame.add(b2);
	frame.add(b3);
	frame.add(b4);
	frame.add(msg);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{

if(e.getSource()==b1)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "");
		System.out.println("Connection Established...");
		Statement st=cn.createStatement();
		
		int x=st.executeUpdate("insert into assessmentrecord(firstname,lastname,email,phone) values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')");
		if(x>0)
		{
			msg.setText("Reecord Inserted...");
		}
		else
		{
			msg.setText("Reecord not Inserted...");
		}
		
		cn.close();
		
	   } 
	
	catch (Exception e1) 
	{
		
		e1.printStackTrace();
	}
}
		


else if(e.getSource()==b2)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "");
		System.out.println("Connection Established...");
		Statement st=cn.createStatement();
		
		ResultSet rs=st.executeQuery("select*from assessmentrecord where sid='"+t1.getText()+"'");
		if(!rs.isFirst()) 
		{
			msg.setText("data not found...");
		}
		
		else 
		{
		while(rs.next())
		{
			System.out.println("sid is..."+rs.getInt(1));
			System.out.println("firstname is..."+rs.getString("firstname"));
			System.out.println("lastname is..."+rs.getString(3));
			System.out.println("email is..."+rs.getString("email"));
			System.out.println("phone is..."+rs.getString("phone"));
			System.out.println("");
		}
		
		
		cn.close();
	}
	   } 
	
	catch (Exception e1) 
	{
		
		e1.printStackTrace();
	}
}




else if(e.getSource()==b3)
{
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "");
		System.out.println("Connection Established...");
		Statement st=cn.createStatement();
		int x=st.executeUpdate("update assessmentrecord set firstname='"+t2.getText()+"',lastname='"+t3.getText()+"',email='"+t3.getText()+"',phone='"+t4.getText()+"'  where firstname='"+t1.getText()+"'");
		if(x>0)
		{
			msg.setText("Reecord Updated...");
		}
		else
		{
			msg.setText("Reecord not Updated...");
		}
		
		cn.close();
		
	   } 
	
	catch (Exception e1) 
	{
		
		e1.printStackTrace();
	}
	
}




else if(e.getSource()==b4)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "");
		System.out.println("Connection Established...");
		Statement st=cn.createStatement();
		int x=st.executeUpdate("delete from assessmentrecord where sid='"+t1.getText()+"'");
		if(x>0)
		{
			msg.setText("Reecord Deleted...");
		}
		else
		{
			msg.setText("Reecord not Deleted...");
		}
		
		cn.close();
		
	   } 
	
	catch (Exception e1) 
	{
		
		e1.printStackTrace();
	}
	
	
	
}

	}
	
}
public class Assessment1 {

	public static void main(String[] args) 
	{
		new table();
	}

}
