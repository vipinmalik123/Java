package org.vipinmalik.collections;

import java.util.*;

/*
 * This class shows sets contain only single instance of objects, no duplication
 * */
public class SetOfIntegers {
	public static void main (String[] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		Random rand = new Random();
		
		for (int i = 0; i <= 50; i++) {
			Integer nextInteger = rand.nextInt(5);
			System.out.print(nextInteger + " ");
			intSet.add(nextInteger);
		}
		
		System.out.println();
		System.out.println(intSet);
	}
}