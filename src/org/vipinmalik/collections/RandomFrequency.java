package org.vipinmalik.collections;

import java.util.*;

public class RandomFrequency {
	public static void main (String[] args) {
		Random rand = new Random();
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for (int i = 0; i <= 1000; i++) {
			Integer r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1: freq+1);
		}
		
		System.out.println(m);
	}
}
