package com.syne.training.defaults;

public interface MyInterface {
	default void m1() {
		System.out.println("m1 of MyInterface");
	}
}
