package com.rishi;

import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
       int[] arr = {1, 4, 6, 8, 2};
       bubble(arr);
       System.out.println(Arrays.toString(arr));
   }

   static void bubble(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) { // i controls the number of passes
           for (int j = 0; j < arr.length - i - 1; j++) { // j goes until arr.length - i - 1
               if (arr[j] > arr[j + 1]) { // Swap if current element is greater than the next
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
   }
}
