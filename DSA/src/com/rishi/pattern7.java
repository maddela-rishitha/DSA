package com.rishi;

public class pattern7 {
	
	public static void main(String[] args) {
		int n=5;
		pattern(n);
		
	}
   static void pattern(int n) {
	   //outer loop
	   for(int row=1;row<=n;row++) {
		//spaces before stars
		for(int space=1;space<=n-row;space++) {
			System.out.print(" ");
		}
		//stars
		for(int col=1;col<=2*row-1;col++) {
			System.out.print("*");
		}
		//space after stars
		for(int space=1;space<=n-row;space++) {
			System.out.print(" ");
		   
	   }
		System.out.println();
	   
   }
   

	
			
		
			
	}
}
