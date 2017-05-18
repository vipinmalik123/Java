package org.vipinmalik.bjp3.ch2;

public class StarFigure {
	public static void main (String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 16 - i * 4; j++) {
				System.out.print("/");
			}

			for (int j = 1; j <= i * 8; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 16 - i * 4; j++) {
				System.out.print("\\");
			}

			System.out.println();
		}
	}
}