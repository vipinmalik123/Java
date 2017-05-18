package org.vipinmalik.misc;

import java.util.Scanner;

public class InsertionSort {
	public static void main (String[] args) {
		// input scanner
		Scanner sc  = new Scanner(System.in);
		
		// get array size
		System.out.print("Enter size of array to sort : ");
		int n = sc.nextInt();
		sc.close();

		// create array of input size with random function
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = (int) Math.ceil(Math.random()*n);
		}

		// display input array
		System.out.print("Input Array : ");
		displayArray(arr);
		System.out.println();

		// call sort to sort array elements
		arr = sort(arr);

		// display sorted array
		System.out.print("Sorted Array : ");
		displayArray(arr);
		System.out.println();
	}

	public static void displayArray (int[] arr) {
		int n = arr.length;

		System.out.print("[");
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i]);

			if (i<n-1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}

	public static int[] sort (int[] arr) {
		// loop through array elements from 2nd index
		for (int i = 1; i < arr.length; i++) {
			// select current element
			int key = arr[i];
			int j = i-1;
			
			// loop while j > 0 and key is less than arr[j]
			while (j >= 0 && arr[j] > key) {
				// swap j+1 with j
				arr[j+1] = arr[j];

				// decrement j
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}