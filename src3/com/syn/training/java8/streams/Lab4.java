package com.syn.training.java8.streams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab4 {

	public static void main(String[] args) {
		Stream<String> strStrm = Stream.of("Nikhil", "Dhiraj", "Rakhi", "Tejas", "Haldhar");
		strStrm.forEach(System.out::println);
		System.out.println("--------After String sort--------------");
		strStrm = Stream.of("Nikhil", "Dhiraj", "Rakhi", "Tejas", "Haldhar");
		strStrm.sorted().forEach(System.out::println);

		IntStream intStrm = IntStream.of(345, 45, 65, 23, 12, 32, 43, 54, 65);
		intStrm.forEach(i -> System.out.print(i + " "));
		System.out.println("--------After int sort--------------");
		intStrm = IntStream.of(345, 45, 65, 23, 12, 32, 43, 54, 65);
		intStrm.sorted().forEach(i -> System.out.print(i + " "));

		System.out.println("--------After Emp natural sort--------------");
		EmpManager.create().stream().sorted().forEach(System.out::println);
		System.out.println("--------After Emp comparator sort--------------");
		EmpManager.create().stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.forEach(System.out::println);

		System.out.println("--------After Emp comparator state and city sort--------------");
		EmpManager.create().stream()
				.sorted((e1, e2) -> e1.getAddress().getState().compareTo(e2.getAddress().getState()))
				.sorted((e1, e2) -> e1.getAddress().getCity().compareTo(e2.getAddress().getCity()))
				.forEach(System.out::println);

		System.out.println("--------After Emp comparator new state and city sort--------------");
		Comparator<Employee> comp1 = (e1, e2) -> e1.getAddress().getState().compareTo(e2.getAddress().getState());
		Comparator<Employee> comp2 = comp1
				.thenComparing((e1, e2) -> e1.getAddress().getCity().compareTo(e2.getAddress().getCity()));
		EmpManager.create().stream().sorted(comp2).forEach(System.out::println);

	}

}
