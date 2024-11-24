package com.rishi;

public class pattern12 {
	public static void main(String[] args) {
		int n=5;
		pattern(n);
	}
	static void pattern(int n) {
		int spaces=2*(n-1);
		//outer loop 
		for(int row=1;row<n;row++) {
			//numbers print
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			//spaces
			for(int col=1;col<=spaces;col++) {
				System.out.print(" ");
			}
			for(int col=1;col>=1;col++) {
				System.out.print(col);
			}
			System.out.println();
			spaces=spaces-2;
		}
		
	}

}
