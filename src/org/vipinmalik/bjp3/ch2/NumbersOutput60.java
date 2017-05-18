package org.vipinmalik.bjp3.ch2;

public class NumbersOutput60 {
	public static void main (String[] args) {
		int val = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.print("         |");
		}

		System.out.println("");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 10; j++) {
				val = j % 10;
				System.out.print(val + "");
			}
		}
	}
}