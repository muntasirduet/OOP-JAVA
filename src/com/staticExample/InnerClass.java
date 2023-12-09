package com.staticExample;

public class InnerClass {
	static class Test {
		String name;
		public Test(String name) {
			this.name = name;
		}		
	}
	
	public static void main(String[] args) {
	;
		Test muntasir = new Test("Muntasir");
		Test halim = new Test("Halim");
		
		System.out.println(muntasir.name);
		System.out.println(halim.name);
	}

}
