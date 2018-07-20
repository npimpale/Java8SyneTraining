package com.syn.training.java8.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab6 {
	public static void main(String[] args) {
		List<Integer> intList = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
		int i = intList.stream().reduce(0, (i1, i2) -> i1 + i2);
		System.out.println("Sum : " + i);

		Optional<Integer> optional = intList.stream().reduce((i1, i2) -> i1 + i2);
		if (optional.isPresent())
			System.out.println(optional.get());

		i = intList.stream().reduce(1, (i1, i2) -> i1 * i2);
		System.out.println("Mult: " + i);

		List<String> strList = Stream.of("Nikhil", "Dhiraj", "Rakhi", "Tejas", "Haldhar").collect(Collectors.toList());
		Optional<String> optionalStr = strList.stream().reduce((s1, s2) -> s1 + ", " + s2);
		if (optionalStr.isPresent())
			System.out.println("Reduce : " + optionalStr.get());

		List<Employee> empList = EmpManager.create();
		double salSum = empList.stream().filter(e -> e.getName().equals("Nikhil")).mapToDouble(d -> d.getSalary())
				.reduce(0d, (d1, d2) -> d1 + d2);
		System.out.println("Nikhil : " + salSum);

		Map<String, Double> nameSalaryMap = new HashMap<>();
		empList.stream().forEach(e -> {
			if (!nameSalaryMap.containsKey(e.getName())) {
				nameSalaryMap.put(e.getName(), e.getSalary());
			} else {
				nameSalaryMap.put(e.getName(), nameSalaryMap.get(e.getName()) + e.getSalary());
			}
		});
		System.out.println(nameSalaryMap);

		Map<String, Double> nameSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.summingDouble(Employee::getSalary)));
		System.out.println(nameSalary);

		Map<String, Long> cityEmpMap = empList.stream()
				.collect(Collectors.groupingBy(( e) -> e.getAddress().getCity(), Collectors.counting()));
		System.out.println(cityEmpMap);
	}
}
