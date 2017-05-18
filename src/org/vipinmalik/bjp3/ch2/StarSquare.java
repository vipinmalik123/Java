package org.vipinmalik.bjp3.ch2;

public class StarSquare {
	public static void main (String[] args) {
		int max_count = 4;

		for (int i = 0; i < max_count; i++) {
			for (int j = 0; j < max_count; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
}