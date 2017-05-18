package org.vipinmalik.tij.ch1;

/**
 * @description Create a class containing an int and a char that are not initialized, 
 * and print their values to verify that Java performs default initialization.
 * @author Vipin Malik
 * @CreatedDate 19/04/2017
 */
public class DefaultClassFields {
	char c;
	boolean bool;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	
	/**
	 * main method to print this class field's default values
	 * @param args String[]
	 */
	public static void main(String[] args) {
		DefaultClassFields d = new DefaultClassFields();
		System.out.println("default values of char c = " + d.c);
		System.out.println("default values of boolean bool = " + d.bool);
		System.out.println("default values of byte b = " + d.b);
		System.out.println("default values of short s = " + d.s);
		System.out.println("default values of int i = " + d.i);
		System.out.println("default values of long l = " + d.l);
		System.out.println("default values of float f = " + d.f);
		System.out.println("default values of double d = " + d.d);
		System.out.println("default values of string str = " + d.str);
	}
}
