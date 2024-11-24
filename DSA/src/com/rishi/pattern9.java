package com.rishi;

public class pattern9 {

	public static void main(String[] args) {
		int n=5;
		erect(n);
		inverted(n);
		
	}
	static void erect(int n) {
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
	
	static void inverted(int n) {
		for(int row=1;row<=n;row++) {
			//spaces before stars
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			}
			//stars
			for(int col=1;col<=2*n-(2*row-1);col++) {
				System.out.print("*");
			}
			//space after stars
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			   
		   }
			System.out.println();
		   
	   }
	}
	
	

}
