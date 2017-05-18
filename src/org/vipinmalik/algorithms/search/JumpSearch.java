package org.vipinmalik.algorithms.search;

public class JumpSearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		System.out.println(jumpSearch(a, 26));
		System.out.println(jumpSearch(a, 10));
	}

	public static int jumpSearch(int[] a, int x) {
		int m = (int) Math.floor(Math.sqrt(a.length));
		int l = 0;
		
		while (a[Math.min(m, a.length) - 1] < x) {
			l = m;
			m = m + (int) Math.floor(Math.sqrt(a.length)); 
			if (l > a.length) {
				return -1;
			}
		}
		
		for (int i = l; i < m; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		
		return -1;
	}

}
