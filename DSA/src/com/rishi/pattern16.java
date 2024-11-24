package com.rishi;

public class pattern16 {

	public static void main(String[] args) {
		int n=5;
		pattern(n);

	}
	static void pattern(int n) {
		for(int row=0;row<n;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print((char)((int)('A'+row))+" ");
			}
			System.out.println();
		}
	}
	

}
