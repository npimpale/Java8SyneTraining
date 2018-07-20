package com.syne.training.statics;

public interface Diamond extends MyInt1, MyInt2 {
	public static void m1() {
		System.out.println("m1 of Diamond");
	}

	public static void m2() {
		System.out.println("m2 of Diamond");
	}
}
