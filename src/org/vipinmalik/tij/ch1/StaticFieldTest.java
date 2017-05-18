package org.vipinmalik.tij.ch1;

public class StaticFieldTest {

	static int i = 48; 
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticFieldTest o1 = new StaticFieldTest();
		StaticFieldTest o2 = new StaticFieldTest();
		
		System.out.println("o1.i = " + o1.i);
		System.out.println("o2.i = " + o2.i);
		
		o1.i++;
		
		System.out.println("After incrementing the value of i : o1.i = " + o1.i);
		System.out.println("After incrementing the value of i : o2.i = " + o2.i);
		
		System.out.println("preferred way of accessing static member is using class name : StaticFieldTest.i = " + StaticFieldTest.i);
	}

}
