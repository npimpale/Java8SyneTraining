package com.syne.training.defaults;

public interface MyInt2 extends MyInterface {

	default void m3() {
		System.out.println("m3 of MyInt2");
	}
	
	default void m4() {
		System.out.println("m3 of MyInt2");
	}
}
