package com.rishi;

public class pattern13 {
	public static void main(String[] args) {
		int n=5;
		pattern(n);
	}

static void pattern(int n) { 
	int num=1;
	//outer loop 
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(num);
			num++;
		}
		System.out.println();
	}
}
}