package org.vipinmalik.bjp3.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercises1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		//negativeSum(new Scanner("14 7 -10 9 -18 -10 17 42 98"));
		
		//evenNumbers(new Scanner(new File("resources/input.txt")));
		
		//boyGirl(new Scanner(new File("resources/input.txt")));
		
		//System.out.println(getFileName());
		
		//writeFourLines();
		
		// Self-Check 6.18
		//printBox(new Scanner(new File("resources/example.txt")), 12);
	}
	
	public static boolean negativeSum (Scanner in) {
		int sum = 0;
		int count = 0;
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				sum += in.nextInt();
				count++;
				if (sum < 0) {
					System.out.format("%d after %d steps", sum, count);
					return true;
				}
			} else {
				in.next();
			}
		}
		System.out.println("no negative sum");
		return false;
	}
	
	public static void evenNumbers(Scanner in) {
		int numCount = 0;
		int evenCount = 0;
		int sum = 0;
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				numCount++;
				int token = in.nextInt();
				sum += token;
				if (token % 2 == 0) {
					evenCount++;
				}
			} else {
				in.next();
			}
		}
		System.out.println(numCount + " numbers, sum = " + sum);
		System.out.format("%d evens (%.2f%%)", evenCount, (((double)evenCount / numCount) * 100));
	}
	
	public static void boyGirl(Scanner in) {
		int boyCount = 0;
		int boySum = 0;
		int girlCount = 0;
		int girlSum = 0;
		int count = 0;
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				count++;
				if (count % 2 == 0) {
					girlCount++;
					girlSum += in.nextInt();
				} else {
					boyCount++;
					boySum += in.nextInt();
				}
			} else {
				in.next();
			}
		}
		
		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
	}
	
	public static String getFileName () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a file name: ");
		String file = sc.next();
		File f = new File(file);
		if (!f.exists()) {
			file = getFileName();
		}
		sc.close();
		return file;
	}
	
	public static void writeFourLines() throws FileNotFoundException {
		PrintStream p = new PrintStream(new File("resources/example.txt"));
		p.println("Testing,");
		p.println("1, 2, 3.");
		p.println("");
		p.println("This is my output file.");
		p.close();
	}
	
	public static void printBox(Scanner in, int num) {
		System.out.print("+");
		for (int i = 0; i < num + 2; i++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
		
		while (in.hasNextLine()) {
			System.out.print("| ");
			String line = in.nextLine();
			System.out.print(line);
			for (int j = 0; j < num - line.length()  + 1; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		System.out.print("+");
		for (int i = 0; i < num + 2; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}

}
