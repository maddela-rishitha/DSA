package com.rishi;

public class pattern10 {
	public static void main(String[] args) {
	int n=5;
	pattern10(n);
	
}
   static void pattern10(int n) {
	   //outer loop
	   for(int row=1;row<=2*n-1;row++) {
		   //starts
		   int stars =row;
		   if(row>n) stars=2*n-row;
		   
		   //outer loop
		   for(int col=1;col<=stars;col++) {
			   System.out.print("*");
		   }
		   System.out.println(" ");
	   }
	   
   }
   }
