package org.vipinmalik.bjp3.ch1;

public class FightSong {
	public static void main (String[] args) {
		printStanzaCouplet();
		System.out.println();
		printSestet();
		System.out.println();
		printSestet();
		System.out.println();
		printStanzaCouplet();
	}

	public static void printGoTeam () {
		System.out.println("Go, team, go!");
	}

	public static void printDoIt () {
		System.out.println("You can do it.");
	}

	public static void printStanzaMiddleCouplet () {
		System.out.println("You're the best,");
		System.out.println("In the West.");
	}

	public static void printStanzaCouplet () {
		printGoTeam();
		printDoIt();
	}

	public static void printSestet () {
		printStanzaCouplet();
		printStanzaMiddleCouplet();
		printStanzaCouplet();
	}
}