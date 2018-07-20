package com.syne.training;

public class MyImpl {

	public static void main(String[] args) {
		MyInterface add = (i, j) -> i + j;
		MyInterface sub = (i, j) -> i - j;
		System.out.println(add.op(2, 3));
		System.out.println(sub.op(2, 3));
	}

}
