package com.syn.training.java8.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lab3 {

	public static void main(String[] args) {
		IntStream myStream = IntStream.of(10, 45, 87, 21, 45, 2, 58, 14);
		System.out.println(myStream.sum());
		myStream = IntStream.of(10, 45, 87, 21, 45, 2, 58, 14);
		OptionalInt myOpt = myStream.min();
		System.out.println(myOpt.getAsInt());
	}
}
