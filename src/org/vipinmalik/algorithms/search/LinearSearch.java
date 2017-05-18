package org.vipinmalik.algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		System.out.println(linearSearch(a, 6));
		System.out.println(linearSearch(a, 4));
	}
	
	public static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
