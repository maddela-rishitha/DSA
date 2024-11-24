package com.rishi;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		System.out.print("Enter the number :");
	Scanner num =new Scanner(System.in);
	int n=num.nextInt();
	
	//for loop
	for(int i=0;i<n;i++) {
		System.out.println(i);
	}
	
	System.out.println();
	
	//while loop
	int i=0;
	while(i<n) {
		System.out.println(i);
		i++;
	}
	}

}
