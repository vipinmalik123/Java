package org.vipinmalik.tij.ch1;

/**
 * 
 * @author Vipin Malik
 * 
 * Primitive Types :- Group of types that is not creating on heap using a referance with new, 
 * rather on stack with direct allocation of space to the variable
 * Following are primitive type in Java
 * boolean (Wrapper Class = Boolean)
 * char (Wrapper Class = Character) (size = 16 bits)
 * byte (Wrapper Class = Byte) (size = 8 bits) (range = -128 -> +127)
 * short (Wrapper Class = Short) (size = 16 bits) (range = -32768 -> +32767)
 * int (Wrapper Class = Integer) (size = 32 bits)
 * long (Wrapper Class = Long) (size = 64 bits)
 * float (Wrapper Class = Float) (size = 32 bits)
 * double (Wrapper Class = Double) (size = 64 bits)
 * void (Wrapper Class = Void)
 */

public class PrimitiveAutoboxing {

	public static void main(String[] args) {
		Boolean B = new Boolean(true);
		boolean b = B;
		
		System.out.println("B = " + B + ", b = " + b);
	}

}