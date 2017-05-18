package org.vipinmalik.bjp3.ch2;

public class StarFigure2 {
	public static final int SIZE = 6;

	public static void main (String[] args) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 1; j <= (SIZE - 1) * 4 - i * 4; j++) {
				System.out.print("/");
			}

			for (int j = 1; j <= i * 8; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= (SIZE - 1) * 4 - i * 4; j++) {
				System.out.print("\\");
			}

			System.out.println();
		}
	}
}