package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnetction {
       public static void main(String[]args) {
    	      String url="jdbc:mysql://localhost:3306/sekhar";
    	      String user="root";
    	      String password="root";
    	      
    	      try {
    	    	  
    	    	  //Loading and Registering Driver class..
    	    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	    	  
    	    	  //Creating connection to database..
    	    	  Connection con=DriverManager.getConnection(url,user,password);
    	    	  
    	    	  //creating statement object..
    	    	  Statement stmt=con.createStatement();
    	    	  
    	    	  //executing statement object and return resultset..
    	    	  ResultSet rs=stmt.executeQuery("select * from student");
    	    	  
    	    	  while(rs.next())
    	    		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
    	    		//Closing connection..
    	    	      con.close();
    	      }catch(Exception e) {
    	    	 e.printStackTrace();
    	      }
       }
}
