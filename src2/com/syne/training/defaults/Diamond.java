package com.syne.training.defaults;

public interface Diamond extends MyInt1, MyInt2 {
	default void m3() {
		System.out.println("m3 of Diamond");
	}
}
