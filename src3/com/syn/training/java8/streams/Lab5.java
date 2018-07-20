package com.syn.training.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Lab5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Nikhil", "Dhiraj", "Rakhi", "Tejas", "Haldhar");
		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		list.stream().map((e) -> {
			Employee emp = new Employee();
			emp.setName(e);
			return emp;
		}).forEach(System.out::println);

		list.stream().filter(s -> s.length() > 5).peek(s -> System.out.println("Filter: " + s)).map(str -> str.length())
				.forEach(s -> System.out.print(s + " "));
	}
}
