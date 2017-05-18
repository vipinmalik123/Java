package org.vipinmalik.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
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
		
		a = selectionSort(a);
		
		System.out.println("Sorted : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length -1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			a = swap(a, i, min);
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
