package com.rishi;

public class pattern15 {

	public static void main(String[] args) {
		int n=5;
		pattern(n);
		
	}
	static void pattern(int n) {
		for(int row=0;row<n;row++) {
			for(char ch='A';ch<='A'+(n-row-1);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}

