package com.rishi;

public class pattern5 {

	public static void main(String[] args) {
		int n=5;
		pattern(n);
		
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}