package com.rishi;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		System.out.print("Enter a number :");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans =0;
		while(n>0) {
			int rem =n%10;
			n=n/10;
			ans =ans *10 +rem;
		}
		System.out.print(ans);
		
	}

}
