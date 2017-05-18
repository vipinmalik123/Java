package org.vipinmalik.bjp4.ch5;

import java.util.Random;
import java.util.Scanner;

public class Exercises1 {

	public static void main(String[] args) {
		
		// Exercise 5.10
		hopscotch(3);
		
		// Exercise 5.9
		//printFactors(24);
		
		// Exercide 5.8
		//randomWalk();
		
		// Exercise 5.7
		//diceSum();
		
		// Exercide 5.6
		//makeGuesses();
		
		// Exercide 5.5
		//randomLines();
		
		// Exercide 5.4
		//randomX();
		
		// Exercide 5.3		
		//System.out.println("toBinary(44) = " + toBinary(44));
		
		
		// Exercise 5.2
		//System.out.println("gcd(105,45) = " + gcd(105,45));
		
		
		// Exercide 5.1
		//showTwos(120);
	}
	
	public static void hopscotch(int num) {
		int i = 1;
		System.out.println("   " + i + "   ");
		
		for (int hop = 0; hop < num; hop++) {
			System.out.println(++i + "     " + ++i);
			System.out.println("   " + ++i + "   ");
		}
	}
	
	public static void printFactors(int num) {
		String output = "1";
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				output += " and " + i;
			}
		}
		
		if (num > 1) {
			output += " and " + num;
		}
		
		System.out.println (output);
	}
	
	public static void randomWalk() {
		int pos = 0;
		int max = 0;
		Random r = new Random();
		System.out.println("position = " + pos);
		while (pos < 3 && pos > -3) {
			if (r.nextInt(2) == 0) {
				pos--;
			} else {
				pos++;
			}
			if (pos > max) {
				max = pos;
			}
			System.out.println("position = " + pos);
		}
		System.out.println("max position = " + max);
	}
	
	public static void diceSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int desiredSum = sc.nextInt();
		sc.close();
		Random r = new Random();
		int sum = 0;
		int dice1 = 0;
		int dice2 = 0;
		while (sum != desiredSum) {
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			sum = dice1 + dice2;
			System.out.println(dice1 + " and " + dice2 + " = " + sum);
		}
	}
	
	public static void makeGuesses () {
		Random r = new Random();
		int guess = 0;
		int count = 0;
		while (guess < 48) {
			guess = r.nextInt(50) + 1;
			System.out.println("guess = " + guess);
			count++;
		}
		System.out.println("total guesses = " + count);
	}
	
	public static void randomLines () {
		Random r = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int j = 0;
		for (int i = 0; i < (r.nextInt(6) + 5); i++) {
			for (j = 0; j < (r.nextInt(80) + 1); j++) {
				System.out.print(alphabet.charAt(r.nextInt(26)));
			}
			System.out.println();
		}
	}
	
	public static void randomX() {
		Random r = new Random();
		int countX = 0;
		int i = 0;
		
		while (countX < 16) {
			countX = r.nextInt(15) + 5;
			for (i = 0; i < countX; i++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
	
	public static String toBinary (int num) {
		String output = "";
		
		if (num == 0) {
			return output + num;
		}
 		
		while (num > 0) {
			output = num %2 + output; 
			num = num / 2;
		}
		
		return output;
	}
	
	public static int gcd (int num1, int num2) {
		int gcd = num1;
		if (num2 != 0) {
			gcd = gcd(num2, num1 % num2);
		}
		
		return Math.abs(gcd);
	}
	
	public static void showTwos (int num) {
		String output = "";
		int inputNum = num;
		while (num % 2 == 0) {
			num = num/2;
			output = "2 * " + output;
		}
		
		System.out.println(inputNum + " = " + output + num);
	}
}
