package org.vipinmalik.algorithms.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 100);
			
			a[i] = n;
		}
		
		System.out.println("Unsorted : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		
		a = bubbleSort(a);
		
		System.out.println("Sorted : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
	public static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j+1]) {
					a = swap(a, j, j+1);
				}
			}
		}
		return a;
	}
	
	public static int[] swap(int[] a, int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		return a;
	}
}
