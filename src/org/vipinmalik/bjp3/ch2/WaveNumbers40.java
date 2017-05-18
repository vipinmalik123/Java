package org.vipinmalik.bjp3.ch2;

public class WaveNumbers40 {
	public static void main (String[] args) {
		int val = 0;

		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.print("_-^-");
		}

		System.out.println();

		for (int i = 1; i <= 20; i++) {
			val = i % 10;
			System.out.print(val + "" + val);
		}

		System.out.println();

		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}
	}
}