package com.swap;

public class SegregateArrayOf0sAna1s {
       public static void main(String[] args) {
    	   
    			int[] arr=new int[] {1,0,1,0,1,0,1,0};
    			int arrsize=arr.length;
    			int left=0;
    			int right=arrsize-1;
    			while(left<right) {
    				while(arr[left]==0&&left<right)
    					left++;
    				while(arr[right]==1&&left<right)
    					right--;
    				if(left<right) {
    					arr[left]=0;
    					arr[right]=1;
    					left++;
    					right--;
    				}
     			}
    			System.out.println("Array after segregation:");
    			for(int i=0;i<arr.length;i++) {
    				System.out.println(arr[i]+"");
    			}
       }
}
