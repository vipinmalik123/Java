package org.vipinmalik.bjp3.ch2;

public class SpacedNumbers {
	public static void main (String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5-i; j >= 1; j--) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
		
	}
}