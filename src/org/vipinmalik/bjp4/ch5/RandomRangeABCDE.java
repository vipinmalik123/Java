package org.vipinmalik.bjp4.ch5;

import java.util.Scanner;

public class RandomRangeABCDE {
	public static void main (String[] args) {
		//System.out.println(zeroDigits(900980708));
		//printLetters("Rabbit");
		sentinelMinMax();
	}
	
	public static void sentinelMinMax () {
		Scanner sc = new Scanner(System.in);
		int num;
		int max = 0;
		int min = 0;
		
		do {
			System.out.print("Type a number (or -1 to stop): ");
			num = sc.nextInt();
			if (num != -1 && (max == 0 || num > max)) {
				max = num;
			}
			if (num != -1 && (min == 0 || num < min)) {
				min = num;
			}
		} while (num != -1);
		
		if (max != 0) {
			System.out.println("Maximum was " + max);
		}
		if (min != 0) {
			System.out.println("Minimum was " + min);
		}
		sc.close();
	}
	
	public static void printLetters (String text) {
		for (int i = 0; i < text.length() - 1; i++) {
			System.out.print(text.charAt(i) + "-");
		}
		
		if (text.length()>0) {
			System.out.print(text.charAt(text.length() - 1));
		}
		System.out.println();
	}
 	
	public static int zeroDigits (int number) {
		int zeroCount = 0;
		
		Integer i = new Integer(number);
		
		String s = i.toString();
		
		String[] strArr = s.split("");
		
		for (String si : strArr) {
			if (si.compareTo("0") == 0) {
				zeroCount++;
			}
		}
		
		return zeroCount;
	}
}