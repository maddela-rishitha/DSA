package com.rishi;

public class pattern3 {

	public static void main(String[] args) {
		int n=5;
		pattern(5);
	}

	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
	}
}
