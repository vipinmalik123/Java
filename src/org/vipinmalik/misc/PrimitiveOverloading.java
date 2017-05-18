package org.vipinmalik.misc;

public class PrimitiveOverloading {
	
	void f1(char x) {System.out.print("f1(char)");}
	void f1(byte x) {System.out.print("f1(byte)");}
	void f1(short x) {System.out.print("f1(short)");}
	void f1(int x) {System.out.print("f1(int)");}
	void f1(long x) {System.out.print("f1(long)");}
	void f1(float x) {System.out.print("f1(float)");}
	void f1(double x) {System.out.print("f1(double)");}
	
	void f2(byte x) {System.out.print("f2(byte)");}
	void f2(short x) {System.out.print("f2(short)");}
	void f2(int x) {System.out.print("f2(int)");}
	void f2(long x) {System.out.print("f2(long)");}
	void f2(float x) {System.out.print("f2(float)");}
	void f2(double x) {System.out.print("f2(double)");}
	
	void f3(short x) {System.out.print("f3(short)");}
	void f3(int x) {System.out.print("f3(int)");}
	void f3(long x) {System.out.print("f3(long)");}
	void f3(float x) {System.out.print("f3(float)");}
	void f3(double x) {System.out.print("f3(double)");}
	
	void f4(int x) {System.out.print("f4(int)");}
	void f4(long x) {System.out.print("f4(long)");}
	void f4(float x) {System.out.print("f4(float)");}
	void f4(double x) {System.out.print("f4(double)");}
	
	void f5(long x) {System.out.print("f5(long)");}
	void f5(float x) {System.out.print("f5(float)");}
	void f5(double x) {System.out.print("f5(double)");}
	
	void f6(float x) {System.out.print("f6(float)");}
	void f6(double x) {System.out.print("f6(double)");}
	
	void f7(double x) {System.out.print("f7(double)");}

	public static void main(String[] args) {
		PrimitiveOverloading p = new PrimitiveOverloading();
		
		// constant
		System.out.print("5 : ");
		p.f1(5);p.f2(5);p.f3(5);p.f4(5);p.f5(5);p.f6(5);p.f7(5);
		System.out.println();
		
		// char
		System.out.print("Char x: ");
		char c = 'x';
		p.f1(c);p.f2(c);p.f3(c);p.f4(c);p.f5(c);p.f6(c);p.f7(c);
		System.out.println();
		
		// byte
		System.out.print("byte 0: ");
		byte b = 0;
		p.f1(b);p.f2(b);p.f3(b);p.f4(b);p.f5(b);p.f6(b);p.f7(b);
		System.out.println();
		
		// short
		System.out.print("short 0: ");
		short s = 0;
		p.f1(s);p.f2(s);p.f3(s);p.f4(s);p.f5(s);p.f6(s);p.f7(s);
		System.out.println();
		
		// int
		System.out.print("int 0: ");
		int i = 0;
		p.f1(i);p.f2(i);p.f3(i);p.f4(i);p.f5(i);p.f6(i);p.f7(i);
		System.out.println();
		
		// long
		System.out.print("long 0: ");
		long l = 0;
		p.f1(l);p.f2(l);p.f3(l);p.f4(l);p.f5(l);p.f6(l);p.f7(l);
		System.out.println();
		
		// float
		System.out.print("float 0: ");
		float f = 0;
		p.f1(f);p.f2(f);p.f3(f);p.f4(f);p.f5(f);p.f6(f);p.f7(f);
		System.out.println();
		
		// double
		System.out.print("double 0: ");
		double d = 0;
		p.f1(d);p.f2(d);p.f3(d);p.f4(d);p.f5(d);p.f6(d);p.f7(d);
		System.out.println();
	}

}
