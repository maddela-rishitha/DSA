package com.rishi;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter a number :");
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int previous =0;
		int current =1;
		int count =2;
		while(count<=n) {
			int temp =current;
			current += previous;
			previous =temp;
			count++;
		}
		System.out.println(current);
		

	}

}
