package org.vipinmalik.bjp3.ch2;

public class NestedNumbers3 {
	public static void main (String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 9; j >= 0; j--) {
				for (int k = 1; k <= j; k++) {
					System.out.print(j + "");
				}
			}

			System.out.println();
		}
	}
}