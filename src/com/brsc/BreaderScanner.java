package com.brsc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BreaderScanner {
       public static void main(String[]args) throws NumberFormatException, IOException {
    	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	      System.out.println("enter a number:");
    	      int a=Integer.parseInt(br.readLine());
    	      System.out.println(a);
    	      Scanner sc =new Scanner(System.in);
    	      System.out.println("enter a number:");
    	       a=sc.nextInt();
    	      System.out.println(a);
    	    		  
       }
}
