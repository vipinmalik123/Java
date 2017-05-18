package org.vipinmalik.algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		System.out.println(binarySearch(a, 0, a.length, 6));
		System.out.println(binarySearch(a, 0, a.length, 4));
		
		System.out.println(binarySearch(a, 0, a.length, 7));
		System.out.println(binarySearch(a, 0, a.length, 3));
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
	
	// Iterative binarySearch
	public static int binarySearch(int[] arr, int v) {
		int l = 0;
		int r = arr.length;
		
		while (r >= l) {
			int mid = (l + (r-1))/2;
			
			if (arr[mid] == v) {
				return mid;
			} else if (r > l && arr[mid] > v) {
				r = mid - 1;
			} else if (r > l && arr[mid] < v) {
				l = mid + 1;
			}
		}
		
		return -1;
	}

}
