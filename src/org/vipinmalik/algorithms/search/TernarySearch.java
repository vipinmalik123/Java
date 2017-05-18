package org.vipinmalik.algorithms.search;

import java.util.Arrays;

public class TernarySearch {
	
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
		
		System.out.println(ternarySearch(a, 0, a.length, 600));
		System.out.println(ternarySearch(a, 0, a.length, 40));
	}
	
	public static int ternarySearch(int[] a, int l, int r, int x) {
		// TODO
		return -1;
	}

}
