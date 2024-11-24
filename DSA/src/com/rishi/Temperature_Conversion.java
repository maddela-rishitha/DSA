package com.rishi;
import java.util.*;

public class Temperature_Conversion {

	public static void main(String[] args) {
	Scanner temp = new Scanner(System.in);
	System.out.print("Enter temperature in C :");
	float tempC = temp.nextFloat();
	float tempF = (tempC*9/5)+32;
	System.out.println("Temperature in F :"+tempF);

	}

}
