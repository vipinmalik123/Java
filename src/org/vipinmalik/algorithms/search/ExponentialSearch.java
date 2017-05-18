package org.vipinmalik.algorithms.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] a = new int[100];
		
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 100);
			
			a[i] = n;
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		
		System.out.println(exponentialSearch(a, 600));
		System.out.println(exponentialSearch(a, 40));
	}
	
	public static int exponentialSearch(int[] a, int x) {
		if (a[0] == x) {
			return 0;
		}
		
		int i = 1;
		int n = a.length;
		
		while (i < n && a[i] <= x) {
			i = i * 2;
		}
		
		return binarySearch(a, i/2, Math.min(i, n), x);

	}
	
	// recursive binarySearch
	public static int binarySearch(int[] arr, int l, int r, int v) {
		int mid = (l + (r-1))/2;
		
		if (r >= l) {
			if (arr[mid] == v) {
				return mid;
			} else if (r > l && v < arr[mid]) {
				return binarySearch(arr, l, mid - 1, v);
			} else if (r > l && v > arr[mid]) {
				return binarySearch(arr, mid + 1, r, v);
			}
		}
		
		return -1;
	}

}
