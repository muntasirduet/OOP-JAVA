package com.singleton;

public class Main {
	public static void main(String[] args) {
		SingleTon singleTon = SingleTon.getInstance("akash","mmmduetcse@gmail.com");
		System.out.println(singleTon);
		SingleTon singleTon1 = SingleTon.getInstance("halim","mmmduetcse@gmail.com");
		System.out.println(singleTon1);
		SingleTon singleTon2 = SingleTon.getInstance("juel","mmmduetcse@gmail.com");
		System.out.println(singleTon2);
	}
}
