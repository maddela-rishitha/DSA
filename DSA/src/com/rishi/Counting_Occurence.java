package com.rishi;
import java.util.*;

public class Counting_Occurence {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner in =new Scanner(System.in);
		int n =in.nextInt();
		int count=0;
		while(n>0) {
			int rem =n%10;
			if(rem==3) {
				count++;
		      }
			n=n/10;
	}
		System.out.println(count);
	}
}


