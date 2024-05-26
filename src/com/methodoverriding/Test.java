package com.methodoverriding;

public class Test {
       public static void main(String[]args) {
    	      SBI sbi=new SBI();
    	      Axis axis=new Axis();
    	      
    	      System.out.println("sbi rate of interest:"+sbi.getRateOfInterest());
    	      System.out.println("axis rate of interest:"+axis.getRateOfInterest());
       }
}
