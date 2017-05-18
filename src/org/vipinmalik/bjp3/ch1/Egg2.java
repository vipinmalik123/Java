package org.vipinmalik.bjp3.ch1;

public class Egg2 {
	public static void main (String[] args) {
		printEggTop();
		printEggBottom();
		printEggMiddle();
		printEggTop();
		printEggBottom();
		printEggMiddle();
		printEggBottom();
		printEggTop();
		printEggMiddle();
		printEggBottom();
	}

	public static void printEggTop () {
		System.out.println("  _______ ");
		System.out.println(" /       \\ ");
		System.out.println("/         \\");
	}

	public static void printEggMiddle () {
		System.out.println("-\"-'-\"-'-\"-");
	}

	public static void printEggBottom () {
		System.out.println("\\         /");
		System.out.println(" \\_______/ ");
	}
}