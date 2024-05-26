package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {
       public static void main(String[]args) throws Exception{
    	      String url="jdbc:mysql://localhost:3306/sekhar";
    	      String uname="root";
    	      String password="root";
    	      
    	      Class.forName("com.mysql.jdbc.Driver");
    	      
    	      Connection con=DriverManager.getConnection(url,uname,password);
    	      
    	      Statement stmt=con.createStatement();
    	      
    	      String sql="INSERT INTO EMPLOYEE VALUES(100,'sai','HYDERABAD',20000)";
    	      
    	      stmt.executeUpdate(sql);
    	      System.out.println("records are successfully inserted..");
    	      
    	      con.close();
       }
}
