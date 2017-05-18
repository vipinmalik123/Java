package org.vipinmalik.bjp3.ch2;

public class LoopSquares {
	public static void main (String[] args) {
		int count;
		int value = 0;

		for (count = 1; count <= 19; count++) {
			value += count;
			System.out.print(value + " ");
			count = count + 1;
		}
	}
}

