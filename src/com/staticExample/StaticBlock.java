package com.staticExample;

public class StaticBlock {
	public static int a =3;
	static int b =10;
	//its run first time when class variable created
	static {
		System.out.println("Static Block is open");
		a = b+10;
	}
	public static void main(String[] args) {
		StaticBlock staticBloack;//static block can not depend on the reference variavle
		System.out.println(StaticBlock.a);
	}

}	
