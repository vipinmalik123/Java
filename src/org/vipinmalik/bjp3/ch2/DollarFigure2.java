package org.vipinmalik.bjp3.ch2;

public class DollarFigure2 {
	public static final int HEIGHT = 5;

	public static void main (String[] args) {
		for (int i = 0; i < HEIGHT; i++) {

			int j = 1;

			for (j = 1; j <= 2*i; j++){
				System.out.print("*");
			}

			for (j = 1; j <= HEIGHT-i; j++){
				System.out.print("$");
			}

			for (j = 1; j <= 2*HEIGHT-2*i; j++){
				System.out.print("*");
			}

			for (j = 1; j <= HEIGHT-i; j++){
				System.out.print("$");
			}

			for (j = 1; j <= 2*i; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}