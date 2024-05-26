package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
       public static void main(String[]args) throws Exception{
    	      String url="jdbc:mysql://localhost:3306/sekhar";
    	      String uname="root";
    	      String password="root";
    	      
    	      //Creating an object of buffered reader..
    	     // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	      
    	      //loading /REgistering driverclass..
    	      Class.forName("com.mysql.jdbc.Driver");
    	      
    	      //creating connection to database.
    	      Connection con=DriverManager.getConnection(url,uname,password);
    	      
    	      //create statment object..
    	      Statement stmt=con.createStatement();
    	      String sql = "CREATE TABLE EMPLOYEE " +
                      "(empid INTEGER not NULL, " +
                      " empname VARCHAR(255), " + 
                      " empaddress VARCHAR(255), " + 
                      " empsalary INTEGER not NULL, " + 
                      " PRIMARY KEY ( empid ))"; 

    	      //receive dynamic tablename ..
    	     // System.out.println("Enter table name:");
    	      //String tablename=br.readLine();
    	      
    	      //execute sql query..
    	      stmt.executeUpdate(sql);
    	      System.out.println("table created successfully..");
    	      con.close();
       }
}

