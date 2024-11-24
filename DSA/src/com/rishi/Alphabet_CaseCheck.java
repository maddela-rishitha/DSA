package com.rishi;
import java.util.*;

public class Alphabet_CaseCheck {

	public static void main(String[] args) {
		System.out.print("Enter a character : ");
		Scanner sc =new Scanner(System.in);
		char ch =sc.next().trim().charAt(0);
		
		if(ch >= 'a' && ch <='z') {
			System.out.print("Lower case characters");
		}
		else if(ch >= 'A' && ch <='Z')
		{
			System.out.print("Upper case characters");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
