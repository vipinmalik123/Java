package org.vipinmalik.bjp3.ch3;

class CountQuarter {
	public static void main(String[] args) {
		int quarters = 0;
		int cents = 0;

		try {
			cents = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			//
		} catch (ArrayIndexOutOfBoundsException e) {
			//
		}

		quarters = countQuarters(cents);

		System.out.println("quarters=" + quarters);
	}

	public static int countQuarters (int cents) {
		int quarters = 0;

		quarters = (cents % 100) / 25;

		return quarters;
	}
}