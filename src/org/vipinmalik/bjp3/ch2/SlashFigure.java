package org.vipinmalik.bjp3.ch2;

public class SlashFigure {
	public static void main (String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("\\\\");
			}

			for (int j = 1; j <= (11 - 2 * i); j++) {
				System.out.print("!!");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("//");
			}
			
			System.out.println();
		}
	}
}