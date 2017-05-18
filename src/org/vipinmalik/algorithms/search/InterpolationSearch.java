package org.vipinmalik.algorithms.search;

import java.util.Arrays;

public class InterpolationSearch {

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
		
		System.out.println(interpolationSearch(a, 600));
		System.out.println(interpolationSearch(a, 4));
	}
	
	public static int interpolationSearch(int[] a, int x) {
		int l = 0;
		int r = a.length - 1;
		
		while (r >= l && x >= a[l] && x <= a[r]) {
			int pos = l + (((r - l) / (a[r] - a[l])) * (x - a[l]));
			
			if (a[pos] == x) {
				return pos;
			} else if (r > l && x < a[pos]) {
				r = pos - 1;
			} else if (r > l && x > a[pos]) {
				l = pos + 1;
			}
		}
		
		return -1;
	}

}
