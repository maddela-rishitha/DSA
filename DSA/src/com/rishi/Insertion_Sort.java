package com.rishi;

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr= {1,5,8,10,25,6};
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			
		   while(j>=0 && arr[j]>key) {
			   arr[j+1]=arr[j];
			   j--;
		   }
		   arr[j+1]=key;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}