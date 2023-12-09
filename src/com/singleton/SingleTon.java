package com.singleton;

public class SingleTon {
	String name,email;
	private SingleTon(String name, String email) {
		this.name = name;
		this.email = email;
	}
	private static SingleTon instance;

	public static SingleTon getInstance(String name, String email) {
		if(instance == null) {
			instance = new SingleTon(name,email);
		}
		return instance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " and "+this.email;
	}
}
