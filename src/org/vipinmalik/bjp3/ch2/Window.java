package org.vipinmalik.bjp3.ch2;

public class Window {
	public static final int SIZE = 7;

	public static void main (String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("+");

				if (j < 3) {
					for (int k = 1; k <= SIZE; k++) {
						System.out.print("=");
					}
				}
			}

			if (i < 3) {
				for (int l = 1; l <= SIZE; l++) { 
					System.out.println("");

					for (int j = 1; j <= 3; j++) {
						System.out.print("|");

						for (int k = 1; k <= SIZE; k++) {
								System.out.print(" ");
						}
					}
				}

				System.out.println("");
			}
		}
	}
}