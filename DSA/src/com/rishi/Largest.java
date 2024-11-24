package com.rishi;
import java.util.*;

public class Largest {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number :");
		int a =in.nextInt();
		int b =in.nextInt();
		int c=in.nextInt();
		int max = a;
		if(b>max) {
			max =b;
		}
		if(c>max) {
			max =c;
		}
		System.out.println(max);
		
		System.out.println();
		
		
		//method-2
		int maximum =Math.max(c,Math.max(a, b));
		System.out.println(maximum);
	}

}
