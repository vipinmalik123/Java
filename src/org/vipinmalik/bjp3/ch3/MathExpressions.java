package org.vipinmalik.bjp3.ch3;

class MathExpressions {
	public static void main(String[] args) {
		System.out.println(Math.abs(-1.6));														// 1.6
		System.out.println(Math.abs(2 + -4));													// 2
		System.out.println(Math.pow(6,2));														// 36.0
		System.out.println(Math.pow(5/2,6));													// 64.0
		System.out.println(Math.ceil(9.1));														// 10.0
		System.out.println(Math.ceil(115.8));													// 116.0
		System.out.println(Math.max(7, 4));														// 7
		System.out.println(Math.min(8, 3 + 2));													// 5
		System.out.println(Math.min(-2, -5));													// -5
		System.out.println(Math.sqrt(64));														// 8.0
		System.out.println(Math.sqrt(76 + 45));													// 11.0
		System.out.println(100 + Math.log10(100));												// 102.0
		System.out.println(13 + Math.abs(-7) - Math.pow(2, 3) + 5);								// 17.0
		System.out.println(Math.sqrt(16) * Math.max(Math.abs(-5), Math.abs(-3)));				// 20.0
		System.out.println(7 - 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5)));			// 13.0
		System.out.println(Math.max(18 - 5 + Math.random(), Math.ceil(4.6 * 3)));				// 14.0
	}
}