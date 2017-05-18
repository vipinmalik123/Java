package org.vipinmalik.bjp3.ch2;

public class SlashFigure2 {
	public static final int HEIGHT = 4;

	public static void main (String[] args) {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("\\\\");
			}

			for (int j = 1; j <= ((2*HEIGHT - 1) - 2 * i); j++) {
				System.out.print("!!");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("//");
			}
			
			System.out.println();
		}
	}
}