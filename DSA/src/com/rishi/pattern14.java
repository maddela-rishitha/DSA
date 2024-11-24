package com.rishi;

public class pattern14 {
  public static void main(String[] args) {
	int n=5;
	pattern(5);
  }
  static void pattern(int n) {
	  //outer loop
	  for(int row=1;row<=n;row++) {
		  for (char ch='A';ch<'A'+row;ch++) {
			  System.out.print(ch);
		  }
		  System.out.println();
	  }
  }
}