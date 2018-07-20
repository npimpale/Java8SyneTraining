package com.syne.training.defaults;

public interface MyInt1 extends MyInterface {
	default void m3() {
		System.out.println("m3 of MyInt1");
	}
}
