package org.vipinmalik.bjp4.ch5;

import java.util.Random;
import java.util.Scanner;

public class Exercises2 {

	public static void main(String[] args) {
		
		// Exercide 5.24
		System.out.println(isAllVowels("aeIou"));
		
		// Exercide 5.23
		//System.out.println(hasAnOddDigit(4822116));
		
		// Exercide 5.22
		//System.out.println(allDigitsOdd(135319));
		
		// Exercide 5.21
		//System.out.println(swapDigitPairs(482596));
		
		// Exercide 5.20
		//System.out.println(digitRange(482596));
		
		// Exercide 5.19
		//System.out.println(firstDigit(-3572));
		
		// Exercide 5.18
		//System.out.println(digitSum(29107));
		
		// Exercide 5.17
		//System.out.println(monthApart(4, 16, 5, 15));
		
		// Exercise 5.16
		//System.out.println(anglePairs(45,45,135));
		
		// Exercide 5.15
		//System.out.println(dominant(4,6,8));
		
		// Exercide 5.14
		//System.out.println(hasMidpoint(4,6,8));
		
		// Exercise 5.13
		//System.out.println(consecutive (-1,2,3));
		
		// Exercide 5.12
		//printAverage(new Scanner(System.in));
		
		// Exercise 5.11
		//threeHeads();
	}
	
	public static boolean isAllVowels(String str) {
		if (str.matches(".*(?i)[^aeiou].*")) {
			return false;
		}
		return true;
	}
	
	public static boolean hasAnOddDigit(int num) {
		num = Math.abs(num);
		while (num >= 10) {
			if ((num % 10) % 2 == 1) {
				return true;
			}
			num = num / 10;
		}
		if (num % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean allDigitsOdd(int num) {
		while (num >= 10) {
			if ((num % 10) % 2 == 0) {
				return false;
			}
			num = num / 10;
		}
		if (num % 2 == 0) {
			return false;
		}
		return true;
	}
	
	public static int swapDigitPairs(int num) {
		int swapNum = 0;
		int i = 0;
		while (num >= 10) {
			swapNum = swapNum + (num % 10) * (int)Math.pow(10, i+1) + ((num/10) % 10) * (int)Math.pow(10, i);
			num = num / 100;
			i += 2; 
		}
		
		swapNum = swapNum + num * (int)Math.pow(10, i);
		
		return swapNum;
	}
	
	public static int digitRange(int num) {
		num = Math.abs(num);
		int max = num % 10;
		int min = num % 10;
		while (num > 1) {
			if (max < (num % 10)){
				max = num % 10;
			}
			if (min > (num % 10)){
				min = num % 10;
			}			
			num = num / 10;
		}
		if (min > 1 && num == 1) {
			min = 1;
		}
		
		if (min != max) {
			return max - min + 1;
		}
		return 1;
	}
	
	
	public static int firstDigit(int num) {
		num = Math.abs(num);
		while (num >= 10) {
			num = num/10;
		}
		return num;
	}
	
	public static int digitSum(int num) {
		int sum = 0;
		num = Math.abs(num);
		while (num >= 10) {
			sum += num % 10;
			num = num/10;
		}
		return sum + num;
	}
	
	public static boolean monthApart (int m1, int d1, int m2, int d2) {
		if ((Math.abs(m1 - m2) == 1 && (m1 < m2 && d1 <= d2) || (m2 < m1 && d1 >= d2)) || Math.abs(m1-m2) > 1) {
			return true;
		}
		return false;
	}
	
	public static boolean anglePairs(int a, int b, int c) {
		if ((a+b == 90 || a+c == 90 || c+b == 90)
				&& (a+b == 180 || a+c == 180 || c+b == 180)) {
			return true;
		}
		return false;
	}
	
	public static boolean dominant(int a, int b, int c) {
		if (a+b < c || b+c < a || c+a < b) {
			return true;
		}
		return false;
	}
	
	public static boolean hasMidpoint (int a, int b, int c) {
		if (a > b) {
			if (c > a) {
				// c > a > b
				if (c-a == a-b) {
					return true;
				}
			} else if (c > b) {
				// a > c > b
				if (a-c == c-b) {
					return true;
				}
			} else {
				// a > b > c
				if (a-b == b-c) {
					return true;
				}
			}
		} else {
			if (c > b) {
				// c > b > a
				if (c-b == b-a) {
					return true;
				}
			} else if (c > a) {
				// b > c > a
				if (b-c == c-a) {
					return true;
				}
			} else {
				// b > a > c
				if (b-a == a-c) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean consecutive(int a, int b, int c) {
		if (a > b) {
			if (c > a) {
				// c > a > b
				if (c-1 == a && c-2 == b) {
					return true;
				}
			} else if (c > b) {
				// a > c > b
				if (a-1 == c && a-2 == b) {
					return true;
				}
			} else {
				// a > b > c
				if (a-1 == b && a-2 == c) {
					return true;
				}
			}
		} else {
			if (c > b) {
				// c > b > a
				if (c-1 == b && c-2 == a) {
					return true;
				}
			} else if (c > a) {
				// b > c > a
				if (b-1 == c && b-2 == a) {
					return true;
				}
			} else {
				// b > a > c
				if (b-1 == a && b-2 == c) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void printAverage(Scanner sc) {
		int num = 0;
		int sum = 0;
		int count = -1;
		while (num >= 0) {
			sum += num;
			count++;
			System.out.print("Type a number: ");
			num = sc.nextInt();
		}
		
		if (count > 0) {
			System.out.println("Average was " + ((double)sum/count));
		}
	}
	
	public static void threeHeads() {
		int cHeads = 0;
		Random r = new Random();
		while (cHeads < 3) {
			if (r.nextInt(2) == 0) {
				cHeads++;
				System.out.print("H ");
			} else {
				cHeads = 0;
				System.out.print("T ");
			}
		}
		System.out.println();
		System.out.println("Three heads in a row!");
	}

}